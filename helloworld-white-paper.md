### Helloworld币白皮书
Helloworld币是为爱好者学习研究区块链技术而研发诞生的加密货币。国人研发、开源、代码精简(核心代码不到1万行)、源代码中文注释、文档齐全的Helloworld币是学习研究区块链的入门好项目。作者一直在追求用最直白、最准确的语言描述区块链技术，因而白皮书一直处于一种更新中的状态，故旧版白皮书可能存在已发现未修正、与代码描述不一致等问题。因作者心力有限，所以作者只维护最新版源码与最新版白皮书。最新版白皮书地址是：https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-white-paper.md ，最新版源码地址是：https://github.com/xingkaichun/HelloworldBlockchain 。by邢开春。

言归正传，先看看官家是如何定义区块链技术。工信部发布的《中国区块链技术和应用发展白皮书2016》这样解释：狭义来讲, 区块链是一种按照时间顺序将数据区块以顺序相连的方式组合成的一种链式数据结构, 并以密码学方式保证的不可篡改和不可伪造的分布式账本。广义来讲，区块链技术是利用块链式数据结构来验证与存储数据、利用分布式节点共识算法来生成和更新数据、利用密码学的方式保证数据传输和访问的安全、利用由自动化脚本代码组成的智能合约来编程和操作数据的一种全新的分布式基础架构与计算范式。

《白皮书2016》关于区块链的定义那么完美，可是区块链初学者或许会看的云里雾里，接连出现的技术名词如数据区块、链式数据结构、分布式账本、块链式、分布式、共识算法、密码学、自动化脚本、智能合约等等会把一个区块链技术初学者恐吓住，以至于认为区块链技术太难，从而学习区块链的事儿还未开始就放弃了，其实在学习之初，我们不需要深究这些晦涩难懂的技术，在跟着作者学习区块链的过程中，自然而然就会一一明白这些概念。从《白皮书2016》上我们可以分析出，区块链是建立在数据区块、链式数据结构、分布式账本、块链式、分布式、共识算法、密码学、自动化脚本、智能合约等等技术之上，形成的一种新的技术。而作者可以告诉你，数据区块、链式数据结构、分布式账本...这些技术早已经存在，故区块链是一种建立在很多"老旧"技术之上的一种技术。作为类比，这有点像钢筋、水泥、制砖等技术都有了，综合运用这些旧的技术，形成了盖房子技术。至于这些"老旧"技术的细节，在学习之初并不需要我们进行深入的研究。

区块链因比特币为人所熟知。区块链是技术，比特币是以区块链技术开发出来的典型应用。比特币代码经过一次次的迭代，比特币源码已经十分庞大臃肿，不适于初学者研究。因此，在比特币的基础上，笔者侧翻就简，只保留加密货币最核心的功能，写了Helloworld加密货币，以供初学者研究区块链技术使用。本文将以Helloworld币为展开，深入研究区块链技术。  

Helloworld币是一种加密货币，简单来说就是货币，就是钱。这个钱很特殊，是一种划时代的钱。最初，世界上不存在货币，大家以物易物；贝壳是一代货币，终结了以物易物的局面；金属是二代货币，相对于一代货币一个贝壳一个形状，二代货币金属货币可铸造成统一规范的样式；三代货币是以人民币、美元等纸币为代表的信任货币。所谓的纸币就是在一张纸上印一幅画，一幅工业上可以大批量制作的画怎么会有价值? 不像一代二代货币的价值来自于物以稀为贵，纸币是一种信任货币，纸币的价值本质上来自于使用者信任它的发行机构。发行机构(一般是政府)垮台了，纸币就真成废纸了。纸币只是信任货币的一种表现形式，信任货币还可以是银行卡上的一串数字，同样这串数字也是国家赋予了它价值。信任货币还可以是一枚硬币。第四代货币是电子货币，电子货币的电子代表电子支付方式，相对于纸币，电子货币摆脱了物质形态的束缚，可以通过支付宝、云闪付、微信、PayPal等多种应用，利用电子支付方式进行跨越千山万水的远距离交易。以Helloworld币为代表的加密货币可以看作第五代货币。加密货币也可以通过电子支付的方式进行交易，因此加密货币也属于电子货币。这里一代二代三代四代五代货币分代之说，是作者因写作白皮书需要而划分的一家之言，若有看到不同分代方法，请勿纠结。

Helloworld币是划时代的货币，它的出现，特别令人震撼。为什么它可以被成为第五代？  
① 匿名  
以银行卡转账为例，甲给乙转账1元钱，从银行方可以查到转账双方的信息(姓名、身份证、住址等等)。而通过加密货币进行交易，如丙给丁转账1Helloworld币，就无法追踪定位到丙与丁的个人信息，此所谓匿名，即隐藏交易双方的信息。纸币交易可以做到匿名，但做不到跨距离的电子支付; 银行卡等可以做到跨距离的电子支付，但做不到匿名性；加密货币既可以做到匿名，又可以做到跨距离的电子支付。一是可以远距离交易，二是交易有匿名性，不能够根据Helloworld币交易信息反推出交易双方的信息，导致像黑客这类用户群体特喜爱使用Helloworld币做违法犯罪活动，奉劝这些黑客门，道路千万条，铁窗两行泪。  
②去中心  
像银行这种未经你允许，可以任意封禁操作你的账户的机构叫做中心化机构。所谓中心化机构，即说这个机构是中心，你是旁枝，机构是主人，你是仆人，中心有作恶的能力，做不做恶全凭中心的自觉，例如银行冻结用户的资产。而加密货币底层是区块链技术，区块链有去中心化特征，不存在拥有绝对权力的中心机构(去中心特征)，每个用户对他的账号拥有无限的权利，没有机构可以在不经过用户的同意下操作用户Helloworld币的账号。特别提示，有很多挂羊头卖狗肉的公司，打着区块连技术的幌子，做着中心化的事。作为作为一名程序员老司机，这里说下，中心化与去中心化技术并不存在谁比谁高等，合适的场景用合适的技术。  
③代码即法律  
加密货币的世界运行在开源的代码程序之上，因为开源所以用户可以随时审查代码。若用户加入了加密货币的世界，则代表了用户同意了加密货币世界的程序代码，不然，你若不同意加密货币世界的程序规则，又没人逼迫你加入，那你就别加入呀。反过来思考，因为加密货币世界里的用户都加入了加密货币的世界，这代表着加密货币世界里的用户都同意了同一份数字货币世界的程序代码。用户都同意同一份代码即用户达成了基于这份代码的共识。执行程序就是在执行用户间的共识，程序就是代码指令，代码指令不会骗人，代码指令怎么写，它就会怎么执行。有人干预就有人操作的空间，而区块链的世界里只有代码，无需人为的干扰和审判，就可以完美的在无人的状态下自行运转，故代码就是区块链世界的金科律令。  
在代码即法律的框架下，可以看到代码规定了Helloworld币的发行总量是一个固定值。代码见 https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-core/src/main/java/com/xingkaichun/helloworldblockchain/core/impl/IncentiveDefaultImpl.java ；https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-core/src/main/java/com/xingkaichun/helloworldblockchain/core/impl/ProofOfWorkConsensusImpl.java ；
### 钱包
Helloworld币作为货币，最基础的功能是交易。

假设甲与乙发生一笔交易，甲转账给乙1个单位的钱。  

一代货币时代，甲是付给乙一个贝壳；二代货币时代，甲是付给乙一个金币；三代货币时代，甲是付给乙一张纸币；四代货币时代，甲从自己的账号(银行卡号)给乙的账号(银行卡号)转1元钱；五代货币时代，显然，现实生活中并没有一种实际存在的物体'Helloworld币'存在，五代货币同四代货币，用户通过操作账户进行转账。

去银行可以办理银行卡账户，通过支付宝应用可以注册支付宝账户。甲与乙的Helloworld币账户哪里来？用户可以自己给自己创建账户，注意，是用户自己给自己创建账户，并不需要另外的人或机构的允许。向某个中心机构(银行、支付宝)去申请一个账户，人家有可能拒绝你的申请，且申请账户时，你的账户信息(用户名、账号、密码等)都会被中心机构得知。而自己创建账户，不需要把自己的信息告诉别人，也没人可以禁止你创建账户。创建Helloworld币账户方式一：通过客户端创建账户，这种方式特别简单，傻瓜式操作就可以了，见 邢开春：数字货币帮助手册；创建Helloworld币账户方式二：如果用户熟悉区块链技术，还可以按照Helloworld币公开的账户规则自行计算出一个账户(该方式规则见 https://zhuanlan.zhihu.com/p/38196092 ，代码见 https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-crypto/src/main/java/com/xingkaichun/helloworldblockchain/crypto/AccountUtil.java)。  

Helloworld币账户由账号和密码构成。账户在加密货币的世界里被称为钱包，账号在加密货币的世界里被称为地址，密码在加密货币的世界里被称为私钥。

Helloworld币的密码是一个256位的二进制数据。Helloworld币世界里把这个256位二进制密码叫做私钥。

请记住私钥即账户密码，切记保护好自己的私钥，不要公开给别人，拥有你的私钥等于拥有了你的密码，拥有你的私钥的人可以任意花你的钱。用户一定要慎重保管自己的密码，不要将密码交给任何人(包括项目方团队、亲朋好友等)、任何交易所、任何钱包软件。如果用户将密码(私钥)保存在交易所、或是将密码保存在钱包软件中、或是将密码告诉他人等就会造成密码泄露，知道你密码的人就可以将你钱包里的钱转走，钱转走了就彻底没了；如果用户将密码保存在硬盘里硬盘丢失了、将密码写在纸条上纸被火灾烧了等造成的密码丢失，则钱还在钱包里，但是因为自己不记得密码，也恢复不了密码，因为只有用密码才能花钱，那么这个钱就是镜花水月，看得到花不到了。如果你有办法恢复找回这个密码，那么恭喜你，钱还是你自己的。

从哪里可以得到私钥？Helloworld币私钥是一个没有任何要求的256位二进制数据，你可以随意写出一个，拿出纸和笔，每次写一个数，这个数只允许是0或是1，连续写256次，这个数据就是私钥了。

Helloworld币的账号是由密码推导出来的。Helloworld币的账号，在区块链的世界，有一个专有名词，叫做地址。生成一个Helloworld币账户的步骤是，随机生成一个密码，根据密码推导出账号，账号和密码就构成了Helloworld币账户。Helloworld币的地址是由私钥按照一种公开的不可逆算法推导出来的，由私钥能推导出地址，由地址不能推导出私钥。因为地址(账号)不能推导出私钥(密码)，因此地址可以公开给别人。甲向乙转账1Helloworld币，就是甲从甲的Helloworld币地址(账号)向乙的Helloworld币地址(账号)转1Helloworld币。作者啰哩吧嗦了那么多，到底如何转账呢？其实只是单纯的使用的话，特别简单，见 邢开春：数字货币帮助手册 。

用户可以创建任意多个256位二进制数据，一个私钥对应一个账户，因此，一个Helloworld币用户可以拥有多个Helloworld币账户。账户的根本是一个随机256位二进制数据，这意味着两个人可能随机创建出到同一个私钥。Helloworld币只认账户不认人。如果某个账户内有Helloworld币余额，无论何人拥有了这个账户的私钥，都可以操作这个账户把余额给转走。

私钥是一个随机的256位的二进制数据，因此总共存在账户的数量是2的256次方。2的256次方是个多大的数？请不要眨眼，答案就是 ： 115792089237316195423570985008687907853269984665640564039457584007913129639936，约为10^77。作为对比，地球上约含有10^23颗沙子，地球上约含有10^50个原子，可观测宇宙约含有10^80个原子。两个用户随机创建同一个私钥的的概率，用三个字来说就是不可能，其概率大约等于随机从宇宙中取出一个原子，然后把原子放进宇宙，然后再次随机从宇宙中取出一个原子，两次都取出了同一个原子的概率。所以不要怕自己的密码被别人随机的给创建出来了，然后钱被别人花了；也不要对随机创建出一个别人的密码去花别人的钱有任何想法，这不如去买张彩票实在。

区块链领域，账户就是钱包，但钱包不止是账户。在区块链的世界，钱包还有另外一个概念，拥有对账户进行存储、交易、查看等一项、或是多项功能的工具称为区块链钱包，简称钱包。用脑子记忆账户，叫脑钱包。在纸张上记录账户，叫纸钱包。用手机操作账户，叫手机钱包。以电脑操纵账户，叫电脑钱包。以硬件存储钱包，叫硬件钱包。以网站存储、交易、查看账户，叫网页钱包。以联网不联网为分类，不能联网的钱包，叫冷钱包或是离线钱包或是断网钱包，能联网的钱包叫热钱包。能联网，账户就可能被黑客通过网络将账户盗走，相对来说，冷钱包比较安全。脑钱包、纸钱包属于冷钱包。只存储地址，用以观察账户状态、金额，不保存私钥、不能转账的钱包叫观察钱包。
### Helloworld币网络
Helloworld币源码经过编译后生成Helloworld币应用(包含Android应用、iOS应用、Windows应用、Linux应用等)。运行Helloworld币应用的计算机(包含服务器、台式电脑、笔记本、手机等)，叫做Helloworld币节点。Helloworld币源码里包含了一份IP地址列表，这些IP被称为种子IP。种子ip见代码 https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-setting/src/main/java/com/xingkaichun/helloworldblockchain/setting/GlobalSetting.java 。每一个IP地址指向一个Helloworld币节点。节点和IP可以看作是等价的，每一个IP可以看作是一个Helloworld币节点，每一个节点可以看作是一个IP。种子IP指向的Helloworld币节点，也被叫做Helloworld币种子节点。种子节点是一种特殊的节点。

每一个运行中的Helloworld币节点，会维护一个节点列表，并持续收集Helloworld币节点放入节点列表，当别人来询问自己知道的节点列表时，返回给询问者。每一个运行中的Helloworld币节点，会循环往复的做两件事，一是向它所知道的节点报告有自己这么一个节点存在，被通知的节点会将该节点加入自己的节点列表；二是向所有已知节点获取其知道的节点列表，然后将新得知的节点列表加入到自己维护的节点列表中。节点广播自己，代码见 https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-netcore/src/main/java/com/xingkaichun/helloworldblockchain/netcore/NodeBroadcaster.java ; 节点搜寻新的节点，代码见 https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-netcore/src/main/java/com/xingkaichun/helloworldblockchain/netcore/NodeSearcher.java 。

最开始，世界上没有Helloworld币节点，只有Helloworld币源码，源码里包含写死的种子节点A、B。然后，作者编译源码生成了应用，在计算机A上启动了种子节点A，在计算机B上启动了种子节点B。然后，其它节点C、D、E...陆续被区块链学习者启动了...

因为任一节点会不时地将自己报告给种子节点，所以种子节点会知道所有的节点列表，又因为任一节点不时地会询问种子节点它所知的节点列表，所以任一节点都将会知道种子节点所知道的节点列表，种子节点知道的节点列表就是所有的节点列表，所以任一节点都会知道所有的节点列表。因此A、B、C、D、E...都将互相知道彼此的存在，并且都会两两互联(互联就是可以相互通讯链接)起来，这些互联起来的线路构成了一个Helloworld币节点互联网络，简称Helloworld币网络。
### 账本
银行内部维护着一本账本，银行的账本会记录用户的任何转账记录。甲向乙银行卡号转账1元时，银行会查看账本上甲的余额，余额不足则甲转账失败；余额足够，则在账本上记录这笔交易，最终，从账本上看，甲的余额减1元，乙的余额加一元。用户没有账本，用户只能间接的通过银行查询，才能确认交易是否成功。甲通过银行确认自己向乙发起的交易是否成功，乙通过银行确认自己是否收到一笔来自于甲的转账。

全体Helloworld币节点共同合作维护着Helloworld币交易的账本，也可以说Helloworld币网络维护着账本。每个Helloworld币节点有且只拥有一本账本。不同的Helloworld币节点可以拥有相同的账本，也可以拥有不同的账本。

正常情况下，Helloworld币网络只应该存在唯一的一本账本才合理呀？账本记录的就是钱，容不得有任何歧义，更不用说账本不同。比如一个账本记录甲转乙1Helloworld币; 另一个账本甲乙没有转账记录; 还有一个账本记录乙转甲1Helloworld币。这三个账本就完完全全的不同，Helloworld币网络拥有这三个账本，会导致各种问题，例如若是结算以哪个为准？因为Helloworld币是去中心的，去中心就是没有权威，没有一个中央，每个节点都应该是平等的，因此Helloworld币天然就允许每个节点拥有自己的账本，Helloworld币天然就允许Helloworld币网络存在多个账本。节点对自己的账本拥有绝对的控制权，可以对自己的拥有的账本进行任意的篡改涂写，但别的节点接不接受你的账本才是重中之重，没人认同你的账本，那你节点存在的账本就没有什么意义。

每个节点都存在一份账本，那么存在这么多的账本，Helloworld币网络以哪一本为准？Helloworld币网络认为'为准'的账本被称为主账本。主账本被Helloworld币网络认同，Helloworld币网络就是全体节点，全体节点都认同这一本账本，这本账本当然就是真正的结算账本了。

现实生活中的账本是由多张页面组成，页上记载着一笔或多笔交易，每笔交易会记载发生的时间、交易双方、交易金额等信息。Helloworld币账本也是由页组成，每页不但存放着一笔或多笔交易，每笔交易会记载发生的时间、交易双方、交易金额等信息，另外还记录着本页生成的时间、前页摘要等信息。

摘要又称概要、内容提要，意思是摘录要点。一篇文章的摘要可以代表这篇文章；账本页摘要也可以代表这个账本页。摘要算法是一种把任意长度的数据转换为一个固定长度数据的数学算法，该算法又被称为哈希算法、散列运算等，该固定长度的结果数据又被称为哈希值、消息摘要。通过摘要算法对账本的页内容进行计算可以得到页摘要。在计算机里，本页生成的时间是个二进制数据，交易也是一串二进制数据数据，页是一串二进制数据数据，自然可以对账本的页使用摘要数学算法算出页摘要。摘要算法见 邢开春：哈希是什么？ 。Helloworld币规定不允许存在页摘要相同的页，如果生成了这么一页，舍弃掉这页，重新生成页，重新计算页摘要，直至出现不同的页摘要。页摘要计算方法见 邢开春：交易哈希 。因为Helloworld币规定不允许存在页摘要相同的页，所以页摘要可以看作页的id，页与页摘要一一映射。可以认为，页变化，页摘要就会变化，页摘要变化，页一定发生了变化。

本页记录着前页的摘要，相当于记载着前页的id，相当于记载着前页；类推，前页也记载着前前页；前前页也记载着前前前页。假设第X页内容改变了，第X页的摘要也会随之改变，第X+1页因为包含第X的页摘要，因此第X+1页的内容也变了，第X+1的摘要也变了。第X+2的摘要也变了....第X页变化，X页后的页面内容、与页摘要都会随之变化。  

账本的页在区块链的世界，被称为区块。账本的页被称为区块十分的形象，区是指区域、一片土地，块指的是方块、立体空间、存储空间，可以存储东西的区域就和页一样是一个容器，可以存放交易、前页摘要、本页生成的时间等信息，因此账本的页在区块链的世界被称为区块。账本的任一页都包含着前一页摘要，前一页的摘要代表前一页，这意味着账本的任一页包含着前一页，因此，整体俯视各页，会发现各页之间因存在关系而链接了起来，形成一个页与页的链子，简称链。这个链本质上还是账本，但是它能突出账本各页(页即区块)之间的关系，”区块链”这个技术专有名词也因此而诞生。

假设存在一份的账本，攻击者篡改了第X页的交易数据，那么第X页的页摘要也会随之变化，那第X+1页因为它的前一页即第X页的页摘要变化了，第X+1页的页摘要也会变化，同理X+2，X+3，X+4......都会随着变化，即整个账本从篡改页开始都会发生变化。这是以链式方式组织数据的优越性之一。

账本中的页在英文中被成为Block，Block是可数名词，基本意思是指带有直边由较硬材料构成的长方形的块状物，如木块、石块或其他固体材料,引申则指高大的建筑物，即大厦、大楼等，因为Block是一个带有体积的容器，故可以存放交易、前页摘要、本页生成的时间等信息，故账本的页在区块链世界被成为Block也十分形象。Chain是链子的意思，因此账本在英文中被成为Blockchain。

页(区块)是区块链世界的基本单位。Helloworld币节点只允许存在整数页的账本，不同的账本只可能相差整数页，不可能存在相差半页这种情况，没有‘半个区块’这种说法。

如果账本页数相同，且每页的信息相同，则为相同账本。Helloworld币协议规定以页最多的账本为主账本；若不同节点同时存在都为页最多的相同账本，此时Helloworld币网络认为它们都是主账本； 若不同节点同时存在都为页最多的不同账本，此时Helloworld币网络也不确定哪一个账本是主账本，账本是会被持续记账的，只要持续记账，账本的页数就会变化，最终，在某一时刻，总会存在主账本。
### 工作证明
记账的基本单位为页，必须一页一页的记录。Helloworld币规定必须拿到允许记账的权证，才允许记录下一页账本。试想一下，如果任何节点都可以无障碍的记账，相同的时间内，谁又能比谁记的页码多呢，谁也不能比谁记的页码多，这就根本形成不了'页最多'的主账本了。另外，如果任何节点都可以毫无障碍得记账，每个节点都会生成一份不同账本，那账本太多太乱了。因此，给记账增加一个难度，可以保证在一定得时间内只有少数人可以记账，能有效的减少账本数量，减少账本的页数。  

矿工如何才能拿到允许记账的权证？拿到这个凭证的方式，应当是公平的、公开的，任何人都有机会拿到，多劳应当有多拿到凭证的机会。Helloworld币里系统会自动出一道题目，求一个随机数（这个随机数在区块链里被称为nonce），由这个随机数参与计算会得到一个256比特的数据，这个数据被称为区块哈希，若区块哈希小于一个值，Helloworld币就认为该矿工获取到了这个凭证。区块哈希计算说明过程见 https://zhuanlan.zhihu.com/p/353570191 ，区块哈希计算代码见 https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-core/src/main/java/com/xingkaichun/helloworldblockchain/core/tools/BlockTool.java ,工作证明代码见 https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-core/src/main/java/com/xingkaichun/helloworldblockchain/core/impl/ProofOfWorkConsensusImpl.java 。
### 挖矿
求随机数的过程叫做挖矿。求随机数的用户被称为矿工。  

挖矿没有比较好的办法，只能拿一个个数去尝试，直到找到符合的随机数，这个过程会一直消耗占用计算机的性能。

无论有多少矿工在挖矿，系统都能保证大约十分钟挖出一个区块（亦或是被称为一页账本、一个矿）。

如果只有极少的人挖矿，求这个随机数的难度就会很小，因为系统要保证十分钟内区块被挖出，挖矿的人少，挖矿的难度若是很大，十分钟内区块就不能被挖出了。系统自动调整难度以使挖矿时间被限制在十分钟左右代码见 https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-core/src/main/java/com/xingkaichun/helloworldblockchain/core/impl/ProofOfWorkConsensusImpl.java 。

假设现在挖矿的难度很小，攻击者事先花了一笔钱，商家确认收到了钱，并发了货，主账本上也记录了这笔交易，可是攻击者收到货后，因为只有少数人在挖矿，所以他此时有能力重新生成一份主账本（假设之前主账本987页，他的一笔支出交易在986页，他从985页开始重新记账，并把自己的一笔支出交易不记账，快速生成一份989页的主账本），他重新进行挖矿生成了一份新的主账本，主账本上没有他所花的那笔交易，所以现在他又可以花那笔钱了，这种攻击被称为双花攻击，一份钱花两次（多次）的攻击。

为了防止双花攻击，所以系统得保证有很多很多的人在挖矿。挖矿的人多，为了保证区块大约在十分钟内产生，系统就会增大挖矿的难度。攻击者若想双花攻击，因为挖矿的难度十分大，所以双花攻击的难度也会十分大。

如果存在两个账本，前N页完全相同，N页后开始出现不同的记账，这种情况叫做分叉。

节点会尽可能的让自己成为主账本，因此节点会尽可能的增加自己账本的页数。增加自己页数的方法有两个：一是努力拿到权证，自己来记下一页，将下一页加到自己在账本上；二是复制页数比自己多的账本到本地，若账本分叉，则需要同步从分叉处的页到本地;若账本未分叉，则只需同步比自己页数多的页到本地。

必然在某一时刻，全网存在着主账本。因为拿到权证记账有难度，同步其它节点的账本比自己记账快，所以很快全网有很多节点都同步了这本账本，很快全网很多节点都存在着主账本，同样是因为拿到权证记账有难度，全网在很长一段时间内，大量节点都拥有着主账本。为了保持自己是主账本，节点会尽力增加自己的页码，因为自己是主账本了，所以不能再同步别人的账本了，节点只能自己拿到权证记账了，因此，全网很多的节点都尝试在主账本上拿到权证记账，也就是，全网有很多节点在同一本账本上尝试记账，因为有大量节点尝试在同一本账本上记账，下一次主账本大概率是在此主账本上继续添加新的页产生，而不是分叉产生。下一次，主账本产生后，又是一个轮回，主账本被大量节点同步，大量节点继续在主账本上记账，主账本继续成为新的主账本......

挖矿难度越大，越不容拿到记账凭证，越不容易分叉，越不容易发生双花攻击。
### 激励
挖矿会损耗计算机硬件、消耗电力，矿工凭什么要挖矿？如果矿工少，挖矿难度就会小，攻击者就很容易进行双花攻击。  

为了吸引诱惑矿工挖矿，系统会给予挖出矿的矿工Helloworld币奖励。奖励分为两种，一是系统给予的挖矿固定奖励，二是交易者给予的手续费。有了奖励的吸引，自然不担心没人来挖矿。计算挖矿奖励，代码见 https://github.com/xingkaichun/HelloworldBlockchain/blob/master/helloworld-blockchain-core/src/main/java/com/xingkaichun/helloworldblockchain/core/impl/IncentiveDefaultImpl.java 。

因为账本的页大小被限制在1024*1024字符，当较多的交易者在发起交易时，记账者只能挑选有限笔交易写入账本，交易者为了让自己的交易被记账者写入账本，只得给予更高的交易手续费。这里的更高指的是每字符给予的手续费更高，因此需要计算交易的大小。计算交易大小，代码见 https://zhuanlan.zhihu.com/p/336827577 。
### 时间节点
2021/03/23  

截至此时，此版本定为第一版本。

2021/03/23

截至此时，此版本定为第二版本。修订地球原子数量错误。

感谢 @小石头(https://www.zhihu.com/people/xiao-shi-tou-57-85) 指出"地球原子数目10^22个原子"的错误。

感谢 @漏网之蟹(https://www.zhihu.com/people/lou-wang-zhi-xie) 与其女朋友 提供的地球原子数目为 10^50 ，见 https://www.zhihu.com/question/392586135 。

2021/03/27

截至此时，此版本定为第三版本。补充钱包的另一层概念。