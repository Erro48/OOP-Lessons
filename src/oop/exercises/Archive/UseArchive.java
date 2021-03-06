package oop.exercises.archive;

public class UseArchive {

	public static void main(final String[] args) {
		final Archive arc = new ArchiveImpl();
		
		arc.add(" Rossi ", 1960 , false );
		arc.add(" Bianchi ", 1980 , true );
		arc.add(" Grigi ", 1980 , true );
		arc.add(" Verdi ", 1972 , true );
		arc.add(" Neri ", 1968 , false );
		arc.remove(" Neri ", 1968) ;
		
		System.out.println(arc.size()); // 3
		System.out.println(arc.allMarried()); // [ Bianchi , Verdi ]
		System.out.println(arc);

	}
}
