package Task;

public class Task1 {

    // 1. Program java menampilkan :
    // firstName, lastname, birthPlace, birthDay, progLangFav

    public String firstName = "Muhammad";
    public String lastName = "Rizki";
    public String birthPlace = "Jakarta";
    public String progLangFav = "Java";
    public String number1 = firstName + " " + lastName + " " + birthPlace + " " + progLangFav;

    // 2. Get Data Array Same
    // array1[] = [2,3,4,5]
    // array2[] = [1,3,5,7]

    // 3. Sort Data Array
    // array[] = [3,2,4,1,5] -> [1,2,3,4,5]

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        System.out.println(task1.number1);

    }

}
