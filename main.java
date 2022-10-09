import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        int[] nums = {1,5,3,78,233,54,32453,4};

        st.add(new Student("vu van dung", 22, 7));
        st.add(new Student("nguyễn văn mạnh", 32, 5));
        st.add(new Student("he văn lô", 18, 9));
        st.add(new Student("vu van dung", 23, 10));
//        cau1(st);
//        cau2(st);
        cau3(st);
//        _414.thirdMax(nums);

    }

    public static void cau1(ArrayList<Student> st) {
        Collections.sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int a = o1.fullName.compareTo(o2.fullName);

                if (a == 0) {
                    return o1.age > o2.age ? -1 : o1.age == o2.age ? 0 : 1;
                } else {
                    return a;
                }

            }
        });

        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i).toString());

        }
    }

    public static void cau2(ArrayList<Student> st) {

        System.out.println("-----câu 2 -----");
        Collections.sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int tuoi = o1.age > o2.age ? -1 : o1.age == o2.age ? 0 : 1;
                if (tuoi == 0) {
                    return o1.GPA < o2.GPA ? -1 : o1.GPA == o2.GPA ? 0 : 1;
                } else
                    return tuoi;

            }

        });
        for (int i = 0; i < st.size(); i++) {
            System.out.println(st.get(i).toString());
        }
    }
    public static void cau3(ArrayList<Student>list) {

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String lName1 = o1.fullName.substring(o1.fullName.lastIndexOf(" ") + 1);
                String lName2 = o2.fullName.substring(o2.fullName.lastIndexOf(" ") + 1);

                return lName1.compareTo(lName2);
            }




        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());}

    }}
