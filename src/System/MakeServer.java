package System;
import java.io.*;
import java.net.*;
import java.util.*;

public class MakeServer {
	
	ServerSocket ss;
	Socket soc;
	
	int nowPlayer;
	int SumTurn;
	int dice;
	
	public MakeServer() {
		
		
		try {
			ss = new ServerSocket(5000);
			System.out.println("남은 인원: 1명");
			while(true) {
				soc = ss.accept();
				System.out.println("게임 준비 완료!!");
				
			}
		}
	}

}
