package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("일반적인 인사");
        builder.makeItems(new String[]{
                "How Are You?",
                "Hi",
                "Hello"
        });
        builder.makeString("시간대별 인사");
        builder.makeItems(new String[]{
                "Good Morning",
                "Good Afternoon",
                "Good Evening"
        });
        builder.close();
    }
}
