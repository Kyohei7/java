package Profile;

public class ProfileEntity {
    private String dataProfile;
    private String favLanguage = "Java";

    // 1. Method -> Return data and data type
    // 2. Method Void -> Tidak mengembalikan data

    // Method Setter
    public void setDataProfile(String profile) {
        this.dataProfile = profile;
    }

    public void setFavLanguage(String language) {
        this.favLanguage = language;
    }

    // Method Getter
    public String getDataProfile() {
        return this.dataProfile;
    }

    public String getFavLanguage() {
        return this.favLanguage;
    }
}
