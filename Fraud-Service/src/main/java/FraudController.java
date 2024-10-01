@RestController
@RequestMapping("/fraud")
public class FraudController {
    @GetMapping("/check/{cardNumber}")
    public ResponseEntity<String> checkFraud(@PathVariable String cardNumber) {
        // Lógica simulada para verificar fraude
        if ("9999".equals(cardNumber)) {
            return ResponseEntity.ok("Card is blacklisted");
        }
        return ResponseEntity.ok("Card is safe");
    }
}
