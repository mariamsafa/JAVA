import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;

class ArithmeticExample {
    void Division() {
        try {
            int a = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }

    void Modulus() {
        try {
            int a = 50 % 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }

    void BigDecimal() {
        try {
            BigDecimal b = new BigDecimal("11");
            BigDecimal c = new BigDecimal("17");
            BigDecimal d = b.divide(c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class ArrayExample {
    void ArrayIndex() {
        try {
            int a[] = new int[5];
            a[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
    // void NegativeArray() {
    //     try {
    //         int a[] = new int[-5];
    //     } catch (NegativeArraySizeException e) {
    //         System.out.println("NegativeArraySize Exception: " + e);
    //     } finally {
    //         System.out.println("Finally block is always executed");
    //     }
    // }
}

class IllegalArgumentExample {
    void IllegalArgument() {
        try {
            Integer.parseInt("abc");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgument Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class NullPointerExample {
    void NullPointer() {
        try {
            String a = null;
            System.out.println(a.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class StringExample {
    void StringIndex() {
        try {
            String a = "This is a string";
            char b = a.charAt(50);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBounds Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class NumberFormatExample {
    void NumberFormat() {
        try {
            int a = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class ClassNotFoundExample {
    void ClassNotFound() {
        try {
            Class.forName("ExampleClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class IllegalAccessExample {
    void IllegalAccess() {
        try {
            Class.forName("ExampleClass").newInstance();
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccess Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class IOExample{
    void IO() {
        try {
            int a = System.in.read();
        } catch (Exception e) {
            System.out.println("IO Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class FileNotFoundExceptionExample {
    void FileNotFoundException() {
        try {
            File file = new File("file.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("FileNotFound Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class NoSuchMethodExample {
    void NoSuchMethod() {
        try {
            Class.forName("StringExample").getDeclaredMethod("method");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethod Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}

class InstanitiationExample{
    void Instanitiation() {
        try {
            Class.forName("ExampleClass").newInstance();
        } catch (InstantiationException e) {
            System.out.println("Instanitiation Exception: " + e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }

}

class types {
    public static void main(String[] args) {
        ArithmeticExample arithexample = new ArithmeticExample();
        arithexample.Division();
        arithexample.Modulus();
        arithexample.BigDecimal();

        System.out.println();

        ArrayExample arrayexample = new ArrayExample();
        arrayexample.ArrayIndex();
        // arrayexample.NegativeArray();

        System.out.println();

        IllegalArgumentExample illegalargumentexample = new IllegalArgumentExample();
        illegalargumentexample.IllegalArgument();

        System.out.println();

        NullPointerExample nullpointerexample = new NullPointerExample();
        nullpointerexample.NullPointer();

        System.out.println();

        StringExample stringexample = new StringExample();
        stringexample.StringIndex();

        System.out.println();

        NumberFormatExample numberformatexample = new NumberFormatExample();
        numberformatexample.NumberFormat();

        System.out.println();

        ClassNotFoundExample classnotfoundexample = new ClassNotFoundExample();
        classnotfoundexample.ClassNotFound();

        System.out.println();

        IllegalAccessExample illegalaccessexample = new IllegalAccessExample();

        System.out.println();

        IOExample ioexample = new IOExample();
        ioexample.IO();

        System.out.println();

        FileNotFoundExceptionExample filenotfoundexceptionexample = new FileNotFoundExceptionExample();
        filenotfoundexceptionexample.FileNotFoundException();

        System.out.println();

        NoSuchMethodExample nosuchmethodexample = new NoSuchMethodExample();
        nosuchmethodexample.NoSuchMethod();

        System.out.println();

        InstanitiationExample instanitiationexample = new InstanitiationExample();
        instanitiationexample.Instanitiation();
    }
}
