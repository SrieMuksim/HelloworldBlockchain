package com.xingkaichun.blockchain.core;

import com.xingkaichun.blockchain.core.model.Block;

/**
 * 挖矿难度
 */
public interface MineDifficulty {
    /**
     * 挖矿的难度
     * @param blockChainDataBase 区块链
     * @param block 目标区块
     */
    String difficulty(BlockChainDataBase blockChainDataBase, Block block);
}