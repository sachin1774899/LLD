package AbstractDesignPattern;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;
    public void set_brightness(){
        System.out.println("Brightness is controlling");
    }

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void change_background(){
        System.out.println("background is changing");
    }
    public UIFactory createUIFactory(){
        if(supportedPlatforms.equals(SupportedPlatforms.ANDROID)){
            return new AndroidFactory();
        }
        else{
            return new IOSFactory();
        }
    }
}
