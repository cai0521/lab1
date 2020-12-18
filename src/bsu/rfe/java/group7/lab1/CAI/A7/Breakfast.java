package bsu.rfe.java.group7.lab1.CAI.A7;

public class Breakfast {

	public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int sum = 0;
        int i = 0;
        System.out.println("Посчитаем количество продуктов");
        for (String arg1 : args)
        {
            String[] part = arg1.split("/");
            if (part[0].equals("Ice cream"))
            {
                Icecream Icecream = new Icecream(part[1]);
                Icecream.consume();
                sum++;
            }
            else if (part[0].equals("Cheese")){
                Cheese cheese = new Cheese();
                cheese.consume();
                sum++;}
            else if (part[0]. equals("Apple")) {
                Apple Apple = new Apple (part[1]);
                Apple.consume();
                sum++;
            }
            i++;
        }
        for(Food item: breakfast)
        {
            if(item != null)
                Consumable.consume();
            else break;
        }
        System.out.println("Количество съеденных продуктов: " +sum);
    }
}
