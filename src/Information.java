public class Information {

    private String gender;
    private int age;
    private String sexualOrientation;
    private int ageGap;

    public Information(String gender, int age, String sexualOrientation, int ageGap) {
        this.gender = gender;
        this.age = age;
        this.sexualOrientation = sexualOrientation;
        this.ageGap = ageGap;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public int getAgeGap() {
        return ageGap;
    }

    public void setAgeGap(int ageGap) {
        this.ageGap = ageGap;
    }
}
