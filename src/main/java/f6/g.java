package f6;

/* loaded from: classes.dex */
public final class g implements c {
    public String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
