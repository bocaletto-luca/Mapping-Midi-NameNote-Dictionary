// Example.java
public class Example {
  public static void main(String[] args) {
    int midiNote = 60;
    System.out.println(MidiMapping.NOTE_NAMES_EN.get(midiNote));  // → C4
  }
}

// MidiMapping.java (simplified)
import java.util.Map;

public class MidiMapping {
  public static final Map<Integer,String> NOTE_NAMES_EN = Map.of(
    60, "C4"
    // … other entries …
  );
}
