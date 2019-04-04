import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;

    private String data;
    private int nonce = 0;
    private long timeStamp;

    public Block(String data, String previousHash) {
        this.previousHash = previousHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        return Helpers.applySha256(previousHash
                + Long.toString(timeStamp)
                + data
                + Integer.toString(nonce));
    }

    public void mineBlock(int difficulty){
        String target = new String(new char[difficulty]).replace('\0', '0');
        while(!hash.substring(0, difficulty).equals(target)){
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Mining complete: " + hash);
    }
}