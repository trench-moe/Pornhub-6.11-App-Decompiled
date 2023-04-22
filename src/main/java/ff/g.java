package ff;

/* loaded from: classes2.dex */
public final class g implements c {
    public String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
