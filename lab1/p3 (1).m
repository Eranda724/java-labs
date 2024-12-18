%2021E075

Gs =tf([-1 1],[2 1 3]);
ltiview(Gs);
figure;
impulse(Gs);
figure;
step(Gs);
figure;
bode(Gs);


%cascaded.

%part 02 a 03

%h=tf([1],[0 0.1 1]);
%g=tf([1 0],[0 0.1 1]);
%sys =h*g;