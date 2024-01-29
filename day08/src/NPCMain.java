// callback, listener, event

public class NPCMain {
    public static void main(String[] args) {
        NPC npc1 = new NPC();
        NPC npc2 = new NPC();

        // Caller
        npc1.setSpeak(new NPCSpeakCallback() {
            @Override
            public void speak() {
                System.out.println("유랑상인 NPC");
            }
        });

        npc2.setSpeak(new NPCSpeakCallback() {
            @Override
            public void speak() {
                System.out.println("헌터 NPC");
            }
        });
    }
}
