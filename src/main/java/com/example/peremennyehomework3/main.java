public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var papper = 763789;
        System.out.println(papper);



        System.out.println("Задание №2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        papper = papper + 4;
        System.out.println(papper);



        System.out.println("Задание №3");
        var dog1 = 8.0;
        var cat1 = 3.6;
        var papper1 = 763789;
        dog1 = dog1 - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        papper = papper - 7639;
        System.out.println(papper);



        System.out.println("Задание №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);



        System.out.println("Задание №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);




        System.out.println("Задание №6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;
        System.out.println(totalWeight);
        var weightDifference = boxerOne - boxerTwo;
        System.out.println(weightDifference);



        System.out.println("Задание №7");
        var totalWeightOne = boxerTwo - boxerOne;
        System.out.println(totalWeightOne);
        var totalWeightTwo = boxerTwo % boxerOne;
        System.out.println(totalWeightTwo);



        System.out.println("Задание №8 часть 1");
        var totalTime = 640;
        var oneStaff = 8;
        var totalStaff = totalTime / oneStaff;
        System.out.println("Всего работников в компании " + totalStaff + " человек");



        System.out.println("Задание №8 часть 2");
        var moreOn94 = totalStaff + 94;
        var betweenHours = moreOn94 * 8;
        System.out.println("Если в компании работает " + moreOn94 + " человека, то всего " + betweenHours + " часа работы может быть поделено между сотрудниками ");
    }
}
