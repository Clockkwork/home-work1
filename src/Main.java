public class Main {
    public static void main(String[] args) {
        int a1 = 2;
        int b1 = 4;
        int a2 = 11;
        int b2 = 10;
        boolean pointA2AndB1 = (a1<a2 && b1<b2 && (a2-a1) < a1 && (b2-b1) <b1);
        boolean pointA1AndB2 = (a2>a1 && b1>b2 && (a1-a2) <a2 && (b1-b2) <b2);
        boolean pointA2AndB2 = (a1>a2 && b1>b2);
        boolean pointA1AndB1 = (a2>a1 && b2>b1);
        boolean pointA1 = (a1==b2);
        boolean pointA2 = (a2==b1);
        if(pointA2AndB1){
            System.out.println("Отрезок пересечения имеет координаты " + a2 + " и " + b1);
        }else if( pointA1AndB2){
            System.out.println("Отрезок пересечения имеет координаты " + a1 + " и " + b2);
        } else if (pointA2AndB2) {
            System.out.println("Отрезок пересечения имеет координаты " + a2 + " и " + b2 );
        } else if (pointA1) {
            System.out.println("Точка пересечения имеет координату " + a1);
        }else{
            System.out.println("Точка пересечения имеет координату " + a2);
        }
    }
    }
