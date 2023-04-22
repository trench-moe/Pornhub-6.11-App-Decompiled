package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.navigation.v;

@v.b("activity")
/* loaded from: classes.dex */
public class b extends v<a> {

    /* renamed from: a  reason: collision with root package name */
    public Context f2640a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f2641b;

    /* loaded from: classes.dex */
    public static class a extends m {
        public Intent y;

        /* renamed from: z  reason: collision with root package name */
        public String f2642z;

        public a(v<? extends a> vVar) {
            super(vVar);
        }

        @Override // androidx.navigation.m
        public void l(Context context, AttributeSet attributeSet) {
            super.l(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, mb.a.f13053c);
            String string = obtainAttributes.getString(4);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.y == null) {
                this.y = new Intent();
            }
            this.y.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.y == null) {
                    this.y = new Intent();
                }
                this.y.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.y == null) {
                this.y = new Intent();
            }
            this.y.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.y == null) {
                    this.y = new Intent();
                }
                this.y.setData(parse);
            }
            this.f2642z = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.m
        public String toString() {
            Intent intent = this.y;
            ComponentName component = intent == null ? null : intent.getComponent();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (component != null) {
                sb2.append(" class=");
                sb2.append(component.getClassName());
            } else {
                Intent intent2 = this.y;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb2.append(" action=");
                    sb2.append(action);
                }
            }
            return sb2.toString();
        }
    }

    /* renamed from: androidx.navigation.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0035b implements v.a {
    }

    public b(Context context) {
        this.f2640a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f2641b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // androidx.navigation.v
    public a a() {
        return new a(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.navigation.v
    public androidx.navigation.m b(androidx.navigation.b.a r12, android.os.Bundle r13, androidx.navigation.s r14, androidx.navigation.v.a r15) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.b.b(androidx.navigation.m, android.os.Bundle, androidx.navigation.s, androidx.navigation.v$a):androidx.navigation.m");
    }

    @Override // androidx.navigation.v
    public boolean e() {
        Activity activity = this.f2641b;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
