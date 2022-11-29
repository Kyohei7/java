package Profile;

public class Class {

    public static void main(String[] args) {
        ProfileEntity profileEntity = new ProfileEntity();

        profileEntity.setDataProfile("Muhammad Rizki");
        profileEntity.setFavLanguage("Java");

        System.out.println(profileEntity.getDataProfile());
        System.out.println(profileEntity.getFavLanguage());

    }

}
