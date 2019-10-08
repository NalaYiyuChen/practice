// public class Numshift {
// 	int numshift(int num) {
// 		int toReturn = num % 10 + 1; 
// 		num = num / 10; 
// 		int times = 1; 
// 		if (num == 9) {
// 			times *= 10; 
// 		}
// 		while (num > 0) {
// 			int last = num % 10 + 1; 
// 			toReturn = 10* times * last + toReturn; 
// 			if ((num % 10) == 9) {
// 				times += 10;
// 			}
// 			times *= 10;
// 			num = num / 10;
// 		}
// 		return toReturn;
// 	}

// 	public static void main(String[] args) {
// 		Numshift n = new Numshift();
// 		System.out.print(n.numshift(Integer.parseInt(args[0]))); 
// 	}
// }

public class Numshift {
    static int numshift(int num) {
        // int toReturn = num % 10 + 1; 
        // num = num / 10; 
        // int times = 1; 
        // if (num == 9) {
        //     times *= 10; 
        // }
        int times = 1;
        int toReturn = 0; 
        while (num > 0) {
            int last = num % 10 + 1;
            if (toReturn == 0) {
              toReturn = last;
              times *= 10;
              if (last == 10) {
                times = 100;
              }
              num = num / 10;
              continue;
            }
            toReturn = times * last + toReturn; 
            if (last == 10) {
              times *= 10;
            }
            times *= 10; 
            num = num / 10;
        }
        return toReturn;
    }

    public static void main(String[] args) {
        System.out.print(numshift(1299390)); 
    }
}