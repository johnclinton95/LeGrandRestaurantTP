package Controller;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import Service.LeGrandRestaurantService;
import modele.Commande;
import modele.Filiale;
import modele.Franchise;
import modele.Menu;
import modele.Restaurant;
import modele.Serveur;
import modele.Table;

@RestController
public class LeGrandRestaurantController {
	
	private LeGrandRestaurantService leGrandRestaurantService;
	public LeGrandRestaurantController(LeGrandRestaurantService leGrandRestaurantService) {
		this.leGrandRestaurantService=leGrandRestaurantService;
	}
	
	@GetMapping("/chiffreAffairesServeur")
	public double chiffreAffairesServeur(Serveur serveur,ArrayList<Commande> commandes)
	{
		return leGrandRestaurantService.getchiffreAffairesServeur(serveur, commandes);
	}
	@GetMapping("/chiffreAffairesRestaurant")
	public double chiffreAffairesRestaurant(Restaurant restaurant)
	{		
		return leGrandRestaurantService.getchiffreAffairesRestaurant(restaurant);
	}
	@GetMapping("/DebutDeService")
	public void DebutDeService(Restaurant restaurant,ArrayList<Table> tables)
	{		
		leGrandRestaurantService.getDebutDeService(restaurant,tables);
	}
	@GetMapping("/Epinglage")
	public void Epinglage(Serveur serveur,ArrayList<Commande> commandes)
	{		
		leGrandRestaurantService.getEpinglage(serveur, commandes);
	}
	@GetMapping("/TableLibre")
	public void TableLibre(Restaurant restaurant)
	{		
		leGrandRestaurantService.getTableLibre(restaurant);
	}
	@GetMapping("/TacheCuisine")
	public boolean TacheCuisine(Serveur serveur,Commande commande)
	{		
		return leGrandRestaurantService.getTacheCuisine(serveur,commande);
	}
	@GetMapping("/Filiale")
	public double Filiale(Franchise franchise,Filiale filiale)
	{		
		return leGrandRestaurantService.getFiliale(franchise,filiale);
	}
	@GetMapping("/CarteRestaurant")
	public ArrayList<Menu> CarteRestaurant(Franchise franchise,ArrayList<Menu> menus)
	{		
		return leGrandRestaurantService.getCarteRestaurant(franchise, menus);
	}
	
	
}
