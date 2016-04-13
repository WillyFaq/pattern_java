import java.io.*;
class Generate{
	
	public static final int HURUF[][][]={
		{ //--A
			{0,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,1,1,1,1},
			{1,0,0,0,1},
			{1,0,0,0,1}
		},
		{ //--B
			{1,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,1,1,1,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,1,1,1,0}
		},
		{ //--C
			{0,1,1,1,1},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{0,1,1,1,1}
		},
		{ //--D
			{1,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,1,1,1,0}
		},
		{ //--E
			{1,1,1,1,1},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,1,1,1,1},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,1,1,1,1}
		},
		{ //--F
			{1,1,1,1,1},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,1,1,1,1},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0}
		},
		{ //--G
			{0,1,1,1,1},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,1,1},
			{1,0,0,0,1},
			{0,1,1,1,1}
		},
		{ //--H
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,1,1,1,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1}
		},
		{ //--I
			{0,1,1,1,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,1,1,1,0}
		},
		{ //--J
			{0,1,1,1,1},
			{0,0,0,0,1},
			{0,0,0,0,1},
			{0,0,0,0,1},
			{0,0,0,0,1},
			{0,1,0,0,1},
			{0,0,1,1,0}
		},
		{ //--K
			{1,0,0,0,1},
			{1,0,0,1,0},
			{1,0,1,0,0},
			{1,1,0,0,0},
			{1,0,1,0,0},
			{1,0,0,1,0},
			{1,0,0,0,1}
		},
		{ //--L
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,1,1,1,1}
		},
		{ //--M
			{1,0,0,0,1},
			{1,1,0,1,1},
			{1,0,1,0,1},
			{1,0,1,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1}
		},
		{ //--N
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,1,0,0,1},
			{1,0,1,0,1},
			{1,0,0,1,1},
			{1,0,0,0,1},
			{1,0,0,0,1}
		},
		{ //--O
			{0,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,0}
		},
		{ //--P
			{1,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,1,1,1,0},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{1,0,0,0,0}
		},
		{ //--Q
			{0,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,1,0,1},
			{0,1,1,1,0},
			{0,0,0,1,0}
		},
		{ //--R
			{1,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,1,1,1,0},
			{1,0,1,0,0},
			{1,0,0,1,0},
			{1,0,0,0,1}
		},
		{ //--S
			{0,1,1,1,1},
			{1,0,0,0,0},
			{1,0,0,0,0},
			{0,1,1,1,0},
			{0,0,0,0,1},
			{0,0,0,0,1},
			{1,1,1,1,0}
		},
		{ //--T
			{1,1,1,1,1},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0}
		},
		{ //--U
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,0}
		},
		{ //--V
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,0,1,0},
			{0,0,1,0,0}
		},
		{ //--W
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,1,0,1},
			{1,0,1,0,1},
			{1,1,0,1,1},
			{1,0,0,0,1}
		},
		{ //--X
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,0,1,0},
			{0,0,1,0,0},
			{0,1,0,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1}
		},
		{ //--Y
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,0,1,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0}
		},
		{ //--Z
			{1,1,1,1,1},
			{0,0,0,0,1},
			{0,0,0,1,0},
			{0,0,1,0,0},
			{0,1,0,0,0},
			{1,0,0,0,0},
			{1,1,1,1,1}
		},
		{ //--1
			{0,0,1,0,0},
			{0,1,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,0,1,0,0},
			{0,1,1,1,0}
		},
		{ //--2
			{0,1,1,1,0},
			{1,0,0,0,1},
			{0,0,0,0,1},
			{0,0,0,1,0},
			{0,0,1,0,0},
			{0,1,0,0,0},
			{1,1,1,1,1}
		},
		{ //--3
			{0,1,1,1,0},
			{1,0,0,0,1},
			{0,0,0,0,1},
			{0,0,1,1,0},
			{0,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,0}
		},
		{ //--4
			{0,0,0,0,1},
			{0,0,0,1,1},
			{0,0,1,0,1},
			{0,1,0,0,1},
			{0,1,1,1,1},
			{0,0,0,0,1},
			{0,0,0,0,1}
		},
		{ //--5
			{1,1,1,1,1},
			{1,0,0,0,0},
			{1,1,1,1,0},
			{0,0,0,0,1},
			{0,0,0,0,1},
			{0,0,0,0,1},
			{1,1,1,1,0}
		},
		{ //--6
			{0,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,0},
			{1,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,0}
		},
		{ //--7
			{1,1,1,1,1},
			{0,0,0,0,1},
			{0,0,0,0,1},
			{0,0,0,1,0},
			{0,0,1,0,0},
			{0,1,0,0,0},
			{0,1,0,0,0}
		},
		{ //--8
			{0,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,0}
		},
		{ //--9
			{0,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,1},
			{0,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,0}
		},
		{ //--0
			{0,1,1,1,0},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{0,1,1,1,0}
		},
		{ //--[Spasi]
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0}
		}
	};
	
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String kal;
		char huruf;
		int h;
		
		System.out.print("Masukan kalimat : ");
		String k = br.readLine();
		kal = k.toUpperCase();
		System.out.println();
		for(int m=0;m<7;m++){
			for(int n=0; n<kal.length(); n++){
				huruf = kal.charAt(n);
				switch(huruf){
					case 'A':
						h=0;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'B':
						h=1;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'C':
						h=2;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'D':
						h=3;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'E':
						h=4;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'F':
						h=5;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'G':
						h=6;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'H':
						h=7;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'I':
						h=8;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'J':
						h=9;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'K':
						h=10;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'L':
						h=11;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'M':
						h=12;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'N':
						h=13;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'O':
						h=14;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'P':
						h=15;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'Q':
						h=16;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'R':
						h=17;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'S':
						h=18;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'T':
						h=19;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'U':
						h=20;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'V':
						h=21;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'W':
						h=22;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'X':
						h=23;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'Y':
						h=24;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case 'Z':
						h=25;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '1':
						h=26;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '2':
						h=27;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '3':
						h=28;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '4':
						h=29;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '5':
						h=30;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '6':
						h=31;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '7':
						h=32;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '8':
						h=33;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '9':
						h=34;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					case '0':
						h=35;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						break;
					default:
						h=36;
						for(int i=0; i<5;i++){
							System.out.print((HURUF[h][m][i]==1)?'@':' ');
						}
						System.out.print(" ");
						
				}
			}
			System.out.println();
		}
	}
}
