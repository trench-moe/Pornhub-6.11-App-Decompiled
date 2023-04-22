uniform mat4 pvmMat;

attribute vec2 vPos;
attribute vec2 vTex;

varying vec2 tex;

void main(void) {
    gl_Position = pvmMat * vec4(vPos, 1.0, 1.0);
    tex = vTex;
}
