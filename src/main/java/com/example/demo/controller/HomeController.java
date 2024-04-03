import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class HomeController {

//    private final AppleService appleService;
    private final KakaoService kakaoService;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String login(Model model) {
//        model.addAttribute("appleUrl", appleService.getAppleLogin());
        model.addAttribute("kakaoUrl", kakaoService.getKakaoLogin());

        return "index";
    }
}