package poly.sol.send;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("매일을 발송합니다: " + message);
        
    }
}

