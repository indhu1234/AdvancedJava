package indhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Wishes
{

	@RequestMapping("/wish")
	public String res(Model m)
	{
		Greetings greet=new Greetings();
		Birthday b=new Birthday();
		greet.setMessage("Greetings from NIIT");
		b.setWish("Happy Birthday");
		greet.setBd(b);
		m.addAttribute("wish",greet);
		m.addAttribute("b",b);
		return "Result";
	}
}
