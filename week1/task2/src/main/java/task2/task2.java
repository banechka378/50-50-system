package task2;

public class task2 {
    public static void main(String[] args) {
        // Тип byte
        System.out.println("Тип byte:");
        System.out.println("Минимальное значение: " + Byte.MIN_VALUE); // -128
        System.out.println("Максимальное значение: " + Byte.MAX_VALUE); // 127
        
        // Тип byte занимает 8 бит (1 байт). Первый бит используется для знака (0 — положительное число, 1 — отрицательное).
        // Оставшиеся 7 бит используются для значения, что даёт диапазон от -2^7 до 2^7-1, т.е. от -128 до 127.
        
        // Тип short
        System.out.println("\nТип short:");
        System.out.println("Минимальное значение: " + Short.MIN_VALUE); // -32,768
        System.out.println("Максимальное значение: " + Short.MAX_VALUE); // 32,767
        
        // Тип short занимает 16 бит (2 байта). Первый бит используется для знака.
        // Оставшиеся 15 бит используются для значения, что даёт диапазон от -2^15 до 2^15-1, т.е. от -32,768 до 32,767.
        
        // Тип int
        System.out.println("\nТип int:");
        System.out.println("Минимальное значение: " + Integer.MIN_VALUE); // -2,147,483,648
        System.out.println("Максимальное значение: " + Integer.MAX_VALUE); // 2,147,483,647
        
        // Тип int занимает 32 бита (4 байта). Первый бит используется для знака.
        // Оставшиеся 31 бит используются для значения, что даёт диапазон от -2^31 до 2^31-1, т.е. от -2,147,483,648 до 2,147,483,647.
        
        // Тип long
        System.out.println("\nТип long:");
        System.out.println("Минимальное значение: " + Long.MIN_VALUE); // -9,223,372,036,854,775,808
        System.out.println("Максимальное значение: " + Long.MAX_VALUE); // 9,223,372,036,854,775,807
       
        // Тип long занимает 64 бита (8 байт). Первый бит используется для знака.
        // Оставшиеся 63 бита используются для значения, что даёт диапазон от -2^63 до 2^63-1, т.е. от -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807.
        
        // Тип float
        System.out.println("\nТип float:");
        System.out.println("Минимальное положительное значение: " + Float.MIN_VALUE); // ~1.4E-45
        System.out.println("Максимальное значение: " + Float.MAX_VALUE); // ~3.4E+38
      
        // Тип float занимает 32 бита (4 байта) и использует стандарт IEEE 754 для представления чисел с плавающей точкой.
        // Существует 1 бит для знака, 8 бит для экспоненты и 23 бита для мантиссы.
        // Это позволяет хранить числа в диапазоне от ~1.4E-45 до ~3.4E+38.
        
        // Тип double
        System.out.println("\nТип double:");
        System.out.println("Минимальное положительное значение: " + Double.MIN_VALUE); // ~4.9E-324
        System.out.println("Максимальное значение: " + Double.MAX_VALUE); // ~1.8E+308
       
        // Тип double занимает 64 бита (8 байт) и использует стандарт IEEE 754 для представления чисел с плавающей точкой.
        // Существует 1 бит для знака, 11 бит для экспоненты и 52 бита для мантиссы.
        // Это позволяет хранить числа в диапазоне от ~4.9E-324 до ~1.8E+308.
        
        // Тип char
        System.out.println("\nТип char:");
        System.out.println("Минимальное значение: " + (int) Character.MIN_VALUE); // 0
        System.out.println("Максимальное значение: " + (int) Character.MAX_VALUE); // 65,535
        // Тип char занимает 16 бит (2 байта) и используется для хранения символов в кодировке UTF-16.
        // Диапазон значений составляет от 0 до 2^16-1, т.е. от 0 до 65,535.
    }
}