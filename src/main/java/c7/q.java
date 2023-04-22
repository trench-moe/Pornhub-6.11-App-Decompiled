package c7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.c0;
import o7.a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f3821c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f3822a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f3823b = -1;

    public final boolean a(String str) {
        Matcher matcher = f3821c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = c0.f11939a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt <= 0) {
                    if (parseInt2 > 0) {
                    }
                }
                this.f3822a = parseInt;
                this.f3823b = parseInt2;
                return true;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public boolean b(o7.a aVar) {
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f13605c;
            if (i10 >= bVarArr.length) {
                return false;
            }
            a.b bVar = bVarArr[i10];
            if (bVar instanceof t7.e) {
                t7.e eVar = (t7.e) bVar;
                if ("iTunSMPB".equals(eVar.f15144j) && a(eVar.f15145m)) {
                    return true;
                }
            } else if (bVar instanceof t7.i) {
                t7.i iVar = (t7.i) bVar;
                if ("com.apple.iTunes".equals(iVar.f15155f) && "iTunSMPB".equals(iVar.f15156j) && a(iVar.f15157m)) {
                    return true;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
