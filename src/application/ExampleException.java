package application;

public class ExampleException {
	
	/* Les exceptions en Java
	 * 
	 * - Un événement découlant d’une situation anormale lors de l’exécution d’un
	 *   programme et qui empêche son exécution normale​
	 * 
	 * - C’est la façon de plus en plus répandue de traiter les conditions d’erreurs
	 *   dans tous les langages​
	 * 
	 * - En java, le traitement des exceptions gère les erreurs d’exécution dans un
	 *  "contexte objet"
	 *  
	 *  Exception: le système crée un objet Exception dans la méthode où se produit la situation anormale​
	 *  
	 *  La méthode peut:​
	 *  
	 *  - Intercepter l’exception selon son type​
	 *  - Et se protéger contre une sortie prématurée due à cette exception en faisant exécuter 
	 *    un bloc de code avant que l’exception ne force le retour de la méthode.
	 *    
	 *    
	 *    En Java, le traitement des exceptions se fait au moyen de cinq mots clés:​ try, catch, throw, throws et finally
	 */
	
	public static void afficher() {
		try {
			System.out.println(10/0);
			
		} catch (Exception erreur) {
			System.out.println("Erreur: " + erreur.getMessage());
			System.out.println("Erreur: " + erreur.toString());
			System.out.println("\nTrace de l'erreur >>>");
			erreur.printStackTrace();
			
		} finally {
			System.out.println("Fin de afficher");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		afficher();
		System.out.println("Fin de main");
		
	}
	
}
