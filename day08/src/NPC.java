public class NPC {

    // callee
    public void setSpeak(NPCSpeakCallback callback) {
        System.out.println("NPC~~~~~");
        callback.speak();
    }
}
