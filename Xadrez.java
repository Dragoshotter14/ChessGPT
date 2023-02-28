import io.github.theokanning.openai.*;
import io.github.theokanning.openai.auth.*;
import io.github.theokanning.openai.completions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OpenAiService openai = new OpenAiService();
        openai.setApiKey(System.getenv("OPENAI_API_SECRET_KEY"));
        Scanner p = new Scanner(System.in);
        CompletionRequest request = new CompletionRequest.Builder()
                .prompt("Jogar Xadrez")
                .maxTokens(10)
                .build();

        CompletionResponse response = openai.complete(request);
        System.out.println(response.getChoices().get(0).getText());
    }
}