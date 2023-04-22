package ia;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes2.dex */
public class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10673a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f10674b;

    /* loaded from: classes2.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.x(b.this.f10674b);
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f10674b = bottomAppBar;
        this.f10673a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public void a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f10674b;
        int i10 = this.f10673a;
        int i11 = BottomAppBar.F0;
        floatingActionButton.setTranslationX(bottomAppBar.G(i10));
        floatingActionButton.o(new a(), true);
    }
}
