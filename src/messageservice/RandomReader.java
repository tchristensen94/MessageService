package messageservice;

import java.util.Random;

/**
 * Created by Timothy on 9/15/2014.
 */
public class RandomReader implements MessageReader{

    private String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce non elit sed lectus aliquet sagittis at aliquam diam. Sed et feugiat diam. Fusce quam tellus, fringilla ac eros vel, convallis imperdiet nisl. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse interdum ipsum a massa lobortis, consectetur iaculis ligula molestie. Maecenas faucibus nec nibh at iaculis. Proin at efficitur sem. Etiam ex nulla, tempus quis aliquet eu, mollis a mi. Nullam ut mollis tellus. Suspendisse ullamcorper leo et nisl vulputate finibus.";
    private String[] words;
    private Random random;

    public RandomReader() {
        words = lorem.split(" ");
        random = new Random();
    }

    @Override
    public String readMessage() {
        return words[random.nextInt(words.length)];
    }
}
