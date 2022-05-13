package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		sc.nextLine();
        //Lesson list
		List<Lesson> list = new ArrayList<>();
        
		//Instanciando Lesson list
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ch = sc.nextLine().charAt(0);
			System.out.print("Título: ");
			String title = sc.nextLine();
			if (ch == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				sc.nextLine();
				list.add(new Video(title, url, seconds));
				System.out.println("");
			} else {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				sc.nextLine();
				list.add(new Task(title, description, questionCount));
				System.out.println("");
			}
		}
		
		//Calculando duração total do curso
		int sum = 0;
		for (Lesson duration : list) {
			sum += duration.duration();
		}
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos");

		sc.close();

	}

}
