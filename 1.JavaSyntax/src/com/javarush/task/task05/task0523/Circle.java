package com.javarush.task.task05.task0523;

/* 
Конструктор
*/

public class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

   public Circle() {
       color = new Color();
   }

    public class Color {
        String description;

        private String getDescription() {
            return description;
        }

        private void setDescription(String description) {
            this.description = description;
        }
    }
}
