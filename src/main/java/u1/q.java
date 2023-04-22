package u1;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: b */
    public View f15501b;

    /* renamed from: a */
    public final Map<String, Object> f15500a = new HashMap();

    /* renamed from: c */
    public final ArrayList<Transition> f15502c = new ArrayList<>();

    @Deprecated
    public q() {
    }

    public q(View view) {
        this.f15501b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f15501b == qVar.f15501b && this.f15500a.equals(qVar.f15500a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f15500a.hashCode() + (this.f15501b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("TransitionValues@");
        m10.append(Integer.toHexString(hashCode()));
        m10.append(":\n");
        StringBuilder l10 = android.support.v4.media.a.l(m10.toString(), "    view = ");
        l10.append(this.f15501b);
        l10.append("\n");
        String l11 = a1.a.l(l10.toString(), "    values:");
        for (String str : this.f15500a.keySet()) {
            l11 = l11 + "    " + str + ": " + this.f15500a.get(str) + "\n";
        }
        return l11;
    }
}
