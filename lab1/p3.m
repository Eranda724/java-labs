
sys=tf([1],[0,0.1,1]);
figure;
impulse(sys);
figure;
step(sys);
figure;
bode(sys);
figure;
bodemag(sys);


%cascaded.

%part 02 a 03

h=tf([1],[0 0.1 1]);
g=tf([1 0],[0 0.1 1]);
sys =h*g;