package e;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f8938b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f8939c = {16843375};
    public static final int[] d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f8940e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f8941f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f8942g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final p.g<String, Constructor<? extends View>> f8943h = new p.g<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f8944a = new Object[2];

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final View f8945c;

        /* renamed from: f  reason: collision with root package name */
        public final String f8946f;

        /* renamed from: j  reason: collision with root package name */
        public Method f8947j;

        /* renamed from: m  reason: collision with root package name */
        public Context f8948m;

        public a(View view, String str) {
            this.f8945c = view;
            this.f8946f = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r12) {
            /*
                Method dump skipped, instructions count: 209
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.o.a.onClick(android.view.View):void");
        }
    }

    public AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        p.g<String, Constructor<? extends View>> gVar = f8943h;
        Constructor<? extends View> orDefault = gVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f8938b);
            gVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f8944a);
    }

    public final void g(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
