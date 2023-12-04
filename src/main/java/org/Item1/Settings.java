package org.Item1;

public class Settings {
    private boolean useAutoSteering;
    private boolean useABS;
    private Diffculty diffculty;

    // 생성자를 private으로 설정 (외부 호출 불가)
    private Settings() { };

    public static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }

    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        System.out.println(settings1);
        System.out.println(settings2);
    }
}