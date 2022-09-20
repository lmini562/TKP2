import java.util.*;
public class connl {
public static void main(String[] args) {
// Объект класса Scanner создается на основе объекта System.in:
Scanner inp=new Scanner(System.in, "Cp866");
String name; // Текстовое поле (имя):
int age; // Числовое поле (возраст):
System.out.println("Wie heißt Du?"); // Задаем вопрос:
name=inp.nextLine();// Считываем текст (имя):
System.out.println("Guten Tag, "+name+"!"); // Приветствие:
System.out.println("Wie alt bist Du?"); // Задаем вопрос:
age=inp.nextInt();// Считываем число (возраст):
System.out.println(name+", Du bist "+age+" Jahre alt!"); // Вывод сообщения:
}}
