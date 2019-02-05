import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CurrentCountry {



    public List<String> getCountries() throws IOException {

        List<String> countryList = Files.readAllLines(new File("/Users/sam/IdeaProjects/CSVMutate/src/countries.txt")
                .toPath(), Charset.defaultCharset());

        return  countryList;
    }
}
