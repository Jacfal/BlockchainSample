public class Main {

    public static void main(String[] args) {
        Block genesisBlock = new Block("Genesis block", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("Second block data", genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Third block data", secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);
    }
}
