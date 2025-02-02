package com.xingkaichun.helloworldblockchain.core.tools;

import com.xingkaichun.helloworldblockchain.core.model.Block;
import com.xingkaichun.helloworldblockchain.core.model.script.InputScript;
import com.xingkaichun.helloworldblockchain.core.model.script.OutputScript;
import com.xingkaichun.helloworldblockchain.core.model.transaction.Transaction;
import com.xingkaichun.helloworldblockchain.core.model.transaction.TransactionInput;
import com.xingkaichun.helloworldblockchain.core.model.transaction.TransactionOutput;
import com.xingkaichun.helloworldblockchain.netcore.transport.dto.*;

import java.util.ArrayList;
import java.util.List;

/**
 * model转dto工具
 *
 * @author 邢开春 409060350@qq.com
 */
public class Model2DtoTool {

    public static BlockDTO block2BlockDTO(Block block) {
        if(block == null){
            return null;
        }
        List<TransactionDTO> transactionDtoList = new ArrayList<>();
        List<Transaction> transactionList = block.getTransactions();
        if(transactionList != null){
            for(Transaction transaction:transactionList){
                TransactionDTO transactionDTO = transaction2TransactionDTO(transaction);
                transactionDtoList.add(transactionDTO);
            }
        }

        BlockDTO blockDTO = new BlockDTO();
        blockDTO.setTimestamp(block.getTimestamp());
        blockDTO.setPreviousHash(block.getPreviousBlockHash());
        blockDTO.setTransactions(transactionDtoList);
        blockDTO.setNonce(block.getNonce());
        return blockDTO;
    }

    public static TransactionDTO transaction2TransactionDTO(Transaction transaction) {
        List<TransactionInputDTO> inputs = new ArrayList<>();
        List<TransactionInput> transactionInputList = transaction.getInputs();
        if(transactionInputList!=null){
            for (TransactionInput transactionInput:transactionInputList){
                TransactionInputDTO transactionInputDTO = new TransactionInputDTO();
                transactionInputDTO.setTransactionHash(transactionInput.getUnspentTransactionOutput().getTransactionHash());
                transactionInputDTO.setTransactionOutputIndex(transactionInput.getUnspentTransactionOutput().getTransactionOutputIndex());
                transactionInputDTO.setInputScript(inputScript2InputScriptDTO(transactionInput.getInputScript()));
                inputs.add(transactionInputDTO);
            }
        }

        List<TransactionOutputDTO> outputs = new ArrayList<>();
        List<TransactionOutput> transactionOutputList = transaction.getOutputs();
        if(transactionOutputList!=null){
            for(TransactionOutput transactionOutput:transactionOutputList){
                TransactionOutputDTO transactionOutputDTO = transactionOutput2TransactionOutputDTO(transactionOutput);
                outputs.add(transactionOutputDTO);
            }
        }

        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setInputs(inputs);
        transactionDTO.setOutputs(outputs);
        return transactionDTO;
    }

    public static InputScriptDTO inputScript2InputScriptDTO(InputScript inputScript) {
        InputScriptDTO inputScriptDTO = new InputScriptDTO();
        inputScriptDTO.addAll(inputScript);
        return inputScriptDTO;
    }

    public static OutputScriptDTO outputScript2OutputScriptDTO(OutputScript outputScript) {
        OutputScriptDTO outputScriptDTO = new OutputScriptDTO();
        outputScriptDTO.addAll(outputScript);
        return outputScriptDTO;
    }

    public static TransactionOutputDTO transactionOutput2TransactionOutputDTO(TransactionOutput transactionOutput) {
        TransactionOutputDTO transactionOutputDTO = new TransactionOutputDTO();
        transactionOutputDTO.setValue(transactionOutput.getValue());
        transactionOutputDTO.setOutputScript(outputScript2OutputScriptDTO(transactionOutput.getOutputScript()));
        return transactionOutputDTO;
    }
}
