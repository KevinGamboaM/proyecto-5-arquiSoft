@SpringBootTest
@AutoConfigureMockMvc
public class FraudControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCheckFraud() throws Exception {
        mockMvc.perform(get("/fraud/check/9999"))
                .andExpect(status().isOk())
                .andExpect(content().string("Card is blacklisted"));
    }
}
