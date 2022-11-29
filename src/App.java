import Profile.ProfileEntity;

public class App {

    private String fullName = "Muhammad Rizki";
    public String address = "Kalibata";

    public static void main(String[] args) {
        // Instance Object
        // Class nameObject = new Class();
        App app = new App();

        // Instance Object
        ProfileEntity profileEntity = new ProfileEntity();
        // profileEntity.dataProfile = app.fullName + " " + profileEntity.favLanguage;

        profileEntity.setDataProfile(app.fullName);

        System.out.println(profileEntity.getDataProfile());

    }
}