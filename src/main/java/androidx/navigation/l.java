package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f2680i = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<String> f2681a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, b> f2682b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Pattern f2683c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2684e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2685f;

    /* renamed from: g  reason: collision with root package name */
    public Pattern f2686g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2687h;

    /* loaded from: classes.dex */
    public static class a implements Comparable<a> {

        /* renamed from: c  reason: collision with root package name */
        public String f2688c;

        /* renamed from: f  reason: collision with root package name */
        public String f2689f;

        public a(String str) {
            String[] split = str.split("/", -1);
            this.f2688c = split[0];
            this.f2689f = split[1];
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(a aVar) {
            int i10 = this.f2688c.equals(aVar.f2688c) ? 2 : 0;
            if (this.f2689f.equals(aVar.f2689f)) {
                i10++;
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f2690a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<String> f2691b = new ArrayList<>();
    }

    public l(String str, String str2, String str3) {
        this.f2683c = null;
        this.d = false;
        this.f2684e = false;
        this.f2686g = null;
        this.f2685f = str2;
        this.f2687h = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            int i10 = 1;
            this.f2684e = parse.getQuery() != null;
            StringBuilder sb2 = new StringBuilder("^");
            if (!f2680i.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f2684e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb2, compile);
                }
                this.d = false;
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    b bVar = new b();
                    int i11 = 0;
                    while (matcher2.find()) {
                        bVar.f2691b.add(matcher2.group(i10));
                        sb3.append(Pattern.quote(queryParameter.substring(i11, matcher2.start())));
                        sb3.append("(.+?)?");
                        i11 = matcher2.end();
                        i10 = 1;
                    }
                    if (i11 < queryParameter.length()) {
                        sb3.append(Pattern.quote(queryParameter.substring(i11)));
                    }
                    bVar.f2690a = sb3.toString().replace(".*", "\\E.*\\Q");
                    this.f2682b.put(str4, bVar);
                    i10 = 1;
                }
            } else {
                this.d = a(str, sb2, compile);
            }
            this.f2683c = Pattern.compile(sb2.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException(android.support.v4.media.b.j("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            }
            a aVar = new a(str3);
            StringBuilder m10 = a1.a.m("^(");
            m10.append(aVar.f2688c);
            m10.append("|[*]+)/(");
            m10.append(aVar.f2689f);
            m10.append("|[*]+)$");
            this.f2686g = Pattern.compile(m10.toString().replace("*|[*]", "[\\s\\S]"));
        }
    }

    public final boolean a(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z10 = !str.contains(".*");
        int i10 = 0;
        while (matcher.find()) {
            this.f2681a.add(matcher.group(1));
            sb2.append(Pattern.quote(str.substring(i10, matcher.start())));
            sb2.append("(.+?)");
            i10 = matcher.end();
            z10 = false;
        }
        if (i10 < str.length()) {
            sb2.append(Pattern.quote(str.substring(i10)));
        }
        sb2.append("($|(\\?(.)*))");
        return z10;
    }

    public final boolean b(Bundle bundle, String str, String str2, h hVar) {
        if (hVar == null) {
            bundle.putString(str, str2);
            return false;
        }
        t tVar = hVar.f2663a;
        try {
            tVar.d(bundle, str, tVar.c(str2));
            return false;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
