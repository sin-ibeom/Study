package Quiz_06;

public class Main {
    public static void main(String[] args) {

        EMP e1 = new EMP(
                1111,
                "Jiho",
                "Manager",
                3000,
                0000
        );
        EMP e2 = new EMP(
                2222,
                "yu gun",
                "job",
                2000,
                1111
        );
        EMP e3 = new EMP(
                2222,
                "han ji",
                "job",
                2000,
                1111
        );

        EmpTable emptable = new EmpTable();
        emptable.EMP_TABLE.add(e1);
        emptable.EMP_TABLE.add(e2);


        System.out.println("===== 연봉 2000 이상 =====");
        for(int i = 0 ; i < emptable.EMP_TABLE.size() ; i++) {
            if(emptable.EMP_TABLE.get(i).연봉 >= 2000) {
                System.out.println(emptable.EMP_TABLE.get(i).이름);
            }
        }

        // 사원 1의 상사 출력

        int temp = 1111;// 상사의 사원번호 임시 지정

        System.out.println("===== 사원번호의 상사 사원 이름 출력 =====");
        for(int i = 0; i < emptable.EMP_TABLE.size(); i++){
            if(emptable.EMP_TABLE.get(i).사원번호 == temp){
                System.out.println(emptable.EMP_TABLE.get(i).이름);
            }
        }


    }
}
