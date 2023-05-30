package sec07;

public class Array21SelectionSort { // class

	public static void main(String[] args) { // main

		// [선택정렬] 내림차순 정렬

		int[] age = null;
		int small = 0; // 임시저장소
		age = new int[] { 1, 3, 2, 5, 4 };

		for (int i = 0; i < age.length - 1; i++) { // age의 갯수-1개만큼 (4개)
			for (int j = i + 1; j < age.length; j++) { // int j = i + 1 은 첫수와 둘째수의 비교를 위해

				if (age[i] < age[j]) { // 만약에 i값(0)이 j값(1) 작으면

					small = age[i]; // small에 age[i(0)](1)을 저장한다 // small(1)
					age[i] = age[j]; // age[i(0)]에 age[j(1)]의 값을 저장한다
					age[j] = small; // small에 있던 값을 age[j(1)]에 저장한다  == age[j(1)]은 1이되고

				}

			}

		}
		
		for(int i : age) {
			System.out.print(i+ "\t");
		}
		
		for(int k=0; k<age.length-1; k++) {
			for(int g = k+1; g>age.length; g++) {
				
			}
		}

	} // main

} // class
