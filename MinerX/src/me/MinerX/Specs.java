package me.MinerX;

import java.util.HashMap;


public class Specs
{
	public static HashMap<String, String> AMD;
	public static HashMap<String, String> NVIDIA;
	public static HashMap<String, String> AMDNeo;
	public static HashMap<String, String> AMD2Neo;
	public static HashMap<String, String> AMD3Neo;
	public static HashMap<String, String> NVIDIANeo;


	public static void initSpecs()
	{
		AMDNeo = new HashMap<String, String>();
		AMD2Neo = new HashMap<String, String>();
		AMD3Neo = new HashMap<String, String>();
		AMD = new HashMap<String, String>();
		NVIDIA = new HashMap<String, String>();
		NVIDIANeo = new HashMap<String, String>();
		AMD.put("AMD Radeon HD 4350", "-I 9 -g 1 -w 128 --thread-concurrency 2048");
		AMD.put("AMD Radeon HD 4750", "-I 11 -g 1 -w 128 --thread-concurrency 1024");
		AMD.put("AMD Radeon HD 4850", "-I 17 -g 1 -w 256 --thread-concurrency 3136");
		AMD.put("AMD Radeon HD 4870", "-I 17 -g 1 -w 128 --thread-concurrency 6400");
		AMD.put("AMD Radeon HD 4890", "-I 15 -g 1 -w 128 --thread-concurrency 6400");
		AMD.put("AMD Radeon HD 5450", "-I 18 -w 256 --shaders 80");
		AMD.put("AMD Radeon HD 5670", "-I 16 -g 2 -w 128 --thread-concurrency 3048");
		AMD.put("AMD Radeon HD 5750", "-I 18 -g 1 -w 256 --thread-concurrency 6016");
		AMD.put("AMD Radeon HD 5770", "-I 17 --thread-concurrency 7680");
		AMD.put("AMD Radeon HD 5830", "-I 18 --thread-concurrency 5600");
		AMD.put("AMD Radeon HD 5850", "-I 19 -g 1 -w 256 --thread-concurrency 5824");
		AMD.put("AMD Radeon HD 5870", "-I 18 -g 1 -w 256 --thread-concurrency 7500");
		AMD.put("AMD Radeon HD 5970", "-I 20 -g 1 -w 128 --thread-concurrency 8000");
		AMD.put("AMD Radeon HD 6320", "-I 9");
		AMD.put("AMD Radeon HD 6450", "--shaders 160 --intensity 8 --worksize 64 --gpu-memclock 900 --gpu-engine 725");
		AMD.put("AMD Radeon HD 6570", "-I 14 -g 1 --shaders 480");
		AMD.put("AMD Radeon HD 6670", "-I 18 -g 1 -w 256 --thread-concurrency 2400");
		AMD.put("AMD Radeon HD 6750", "-I 16 -g 1 -w 128 --thread-concurrency 5760");
		AMD.put("AMD Radeon HD 6770", "-I 18 -g 1 -w 256 --thread-concurrency 8192");
		AMD.put("AMD Radeon HD 6790", "-I 18 -g 1 -w 256 --thread-concurrency 4032");
		AMD.put("AMD Radeon HD 6850", "-I 17 -g 2 -w 256 --thread-concurrency 3840");
		AMD.put("AMD Radeon HD 6870", "-I 12 --gpu-memclock 760 --gpu-engine 850 --thread-concurrency 8192");
		AMD.put("AMD Radeon HD 6930", "-I 18 -g 1 -w 256 --thread-concurrency 6400");
		AMD.put("AMD Radeon HD 6950", "-I 15 -g 1 -w 256 -l 1 --thread-concurrency 6144");
		AMD.put("AMD Radeon HD 6970", "-I 19 -w 256 --shaders 1536");
		AMD.put("AMD Radeon HD 7750", "-I 12 --gpu-memclock 760 --gpu-engine 850 --thread-concurrency 8192");
		AMD.put("AMD Radeon HD 7770", "-I 15 --worksize 256 -g 1 --thread-concurrency 8000");
		AMD.put("AMD Radeon HD 7790", "-I 18 -g 1 -w 256 --thread-concurrency 8000");
		AMD.put("AMD Radeon HD 7850", "-I 17 -g 1 --lookup-gap 2 -w 256 --thread-concurrency 10048 --gpu-engine 1200 --gpu-memclock 1250");
		AMD.put("AMD Radeon HD 7870", "-I 12 -g 2 -w 256 --thread-concurrency 8192");
		AMD.put("AMD Radeon HD 7950", "-w 256 -I 19 -s 1 -g 1 --gpu-powertune 3 --gpu-engine 1035 --gpu-memclock 1250 --lookup-gap 2 --thread-concurrency 24000");
		AMD.put("AMD Radeon HD 7970", "-I 13 -g 2 -w 256 --thread-concurrency 8192 --gpu-memclock 1250 --gpu-engine 1025");
		AMD.put("AMD Radeon HD 7990", "-I 13 -g 2 -w 256 --thread-concurrency 8192");
		AMD.put("AMD Radeon R9 270", "-I 19 -w 256 --thread-concurrency 16000 --gpu-memclock 1500 --gpu-engine 1125");
		AMD.put("AMD Radeon R9 270x", "-w 256 -I 19 --shaders 1280 --gpu-memclock 1500 --gpu-engine 1125 --thread-concurrency 160000");		
		AMD.put("AMD Radeon R9 280x", "-g 2 --worksize 256 -I 13 --thread-concurrency 8192 --gpu-engine 1050 --gpu-memclock 1500");
		AMD.put("AMD Radeon R9 290", " -I 20 -g 2 -w 512 --thread-concurrency 32765 --gpu-memclock 1500 --gpu-engine 990");
		AMD.put("AMD Radeon R9 290x", "-I 20 -w 256 --thread-concurrency 32765");
		
		NVIDIA.put("NVIDIA GeForce GTX 760","-d 0 -i 0 -C 2 -l K12x18");
		NVIDIA.put("NVIDIA GeForce GTX 780 Ti","-l T30x16 -i 1 -m 1 -H 1");
		NVIDIA.put("NVIDIA GeForce 8800 GT","-H 1 (L27x3)");
		NVIDIA.put("NVIDIA GeForce 9600 GT","-H 1 -d 0 -i 1 -l S8x4 -C 1 -m 1");
		NVIDIA.put("NVIDIA GeForce 9800 GT","-l auto -d 0");
		NVIDIA.put("NVIDIA GeForce GTX 260","-l 54x3");
		NVIDIA.put("NVIDIA GeForce GT 440","-l 12x2");
		NVIDIA.put("NVIDIA GeForce GT 520","-C 2 -i 0");
		NVIDIA.put("NVIDIA GeForce GT 640","-l 82x2 -C 2 -i 0");
		NVIDIA.put("NVIDIA GeForce GTX 260","-l S27x3");
		NVIDIA.put("NVIDIA GeForce GTX 275","-i 0 -d 0");
		NVIDIA.put("NVIDIA GeForce GTS 450","-l F24x8 -i 0 -C 2 -H 1");
		NVIDIA.put("NVIDIA GeForce GTX 460","-d 0 -i 0 -l 28x8 -C 2");
		NVIDIA.put("NVIDIA GeForce GTX 470","-H 1 -i 0");
		NVIDIA.put("NVIDIA GeForce GTX 480","-t 1 -H 1 -d 0 -i 0 -l F14x16 -C 1");
		NVIDIA.put("NVIDIA GeForce GTX 555","-l 12x6");
		NVIDIA.put("NVIDIA GeForce GTX 560","-l 14x8");
		NVIDIA.put("NVIDIA GeForce GTX 550 Ti","-i 1 -l F16x8");
		NVIDIA.put("NVIDIA GeForce GTX 560 Ti","-t 1 -H 1 -d 0 -i 0 -l F14x16 -C 1");
		NVIDIA.put("NVIDIA GeForce GTX 570","-t 1 -H 1 -d 0 -i 0 -l F14x16 -C 1");
		NVIDIA.put("NVIDIA GeForce GTX 580","=l 32x7");
		NVIDIA.put("NVIDIA GeForce GTX 590","-H 1 -d 0 -i 0 -l F16x16 -C -m 1");
		NVIDIA.put("NVIDIA GeForce GT 640","-i 0 -C 2 -l K41x4");
		NVIDIA.put("NVIDIA GeForce GTX 650","d 0 -i 0 -l K12x16 -C 1 -H 1");
		NVIDIA.put("NVIDIA GeForce GTX 650 Ti","-H 1 -d 0 -i 1 -l K8x16 -C 0");
		NVIDIA.put("NVIDIA GeForce GTX 660","-i 0 -l K10x16 -C 2 -m 1");
		NVIDIA.put("NVIDIA GeForce GTX 660 Ti","-C1 -1 K112x2 -i 0");
		NVIDIA.put("NVIDIA GeForce GTX 670","-C 2 -D -i 0 -l 56x5");
		NVIDIA.put("NVIDIA GeForce GTX 680","-H 1 -C 2 -m 1 -d 0 -l K16x16 -i 0");
		NVIDIA.put("NVIDIA GeForce GTX 770","-D -H 1 -m 1 -d 0 -i 1 -l K16x16 -C 2");
		NVIDIA.put("NVIDIA GeForce GTX TITAN","-d 0 -i 0 -C 2 -l K14x18");
		
		AMDNeo.put("AMD Radeon HD 4350", "-I 9 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 4750", "-I 11 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 4850", "-I 17 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 4870", "-I 17 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 4890", "-I 15 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 5450", "-I 18 -w 256 --shaders 80");
		AMDNeo.put("AMD Radeon HD 5670", "-I 16 -g 2 -w 128");
		AMDNeo.put("AMD Radeon HD 5750", "-I 18 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 5770", "-I 17");
		AMDNeo.put("AMD Radeon HD 5830", "-I 18");
		AMDNeo.put("AMD Radeon HD 5850", "-I 19 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 5870", "-I 18 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 5970", "-I 20 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 6320", "-I 9");
		AMDNeo.put("AMD Radeon HD 6450", "--shaders 160 --intensity 8 --worksize 64 --gpu-memclock 900 --gpu-engine 725");
		AMDNeo.put("AMD Radeon HD 6570", "-I 14 -g 1 --shaders 480");
		AMDNeo.put("AMD Radeon HD 6670", "-I 18 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 6750", "-I 16 -g 1 -w 128");
		AMDNeo.put("AMD Radeon HD 6770", "-I 18 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 6790", "-I 18 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 6850", "-I 17 -g 2 -w 256");
		AMDNeo.put("AMD Radeon HD 6870", "-I 12 --gpu-memclock 760 --gpu-engine 850");
		AMDNeo.put("AMD Radeon HD 6930", "-I 18 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 6950", "-I 15 -g 1 -w 256 -l 1");
		AMDNeo.put("AMD Radeon HD 6970", "-I 19 -w 256 --shaders 1536");
		AMDNeo.put("AMD Radeon HD 7750", "-I 12 --gpu-memclock 760 --gpu-engine 850");
		AMDNeo.put("AMD Radeon HD 7770", "-I 15 --worksize 256 -g 1");
		AMDNeo.put("AMD Radeon HD 7790", "-I 18 -g 1 -w 256");
		AMDNeo.put("AMD Radeon HD 7850", "-I 17 -g 1 -w 256 --gpu-engine 1200 --gpu-memclock 1250");
		AMDNeo.put("AMD Radeon HD 7870", "-I 12 -g 2 -w 256");
		AMDNeo.put("AMD Radeon HD 7950", "-w 256 -I 19 -s 1 -g 1 --gpu-powertune 3 --gpu-engine 1035 --gpu-memclock 1250");
		AMDNeo.put("AMD Radeon HD 7970", "-I 13 -g 2 -w 256 --gpu-memclock 1250 --gpu-engine 1025");
		AMDNeo.put("AMD Radeon HD 7990", "-I 13 -g 2 -w 256");
		AMDNeo.put("AMD Radeon R9 270", "-I 13 -w 16 --gpu-memclock 1500 --gpu-engine 1125");
		AMDNeo.put("AMD Radeon R9 270x", "-w 256 -I 19 --shaders 1280 --gpu-memclock 1500 --gpu-engine 1125");		
		AMDNeo.put("AMD Radeon R9 280x", "-g 2 -w 48 -I 14 --gpu-engine 1050 --gpu-memclock 1500");
		AMDNeo.put("AMD Radeon R9 290", " -I 14 -g 2 -w 32");
		AMDNeo.put("AMD Radeon R9 290x", "-I 20 -w 256 -g 2");
		
		AMD2Neo.put("AMD Radeon HD 4350", "-I 9 -g 1 -w 128 --thread-concurrency 2048,2048");
		AMD2Neo.put("AMD Radeon HD 4750", "-I 11 -g 1 -w 128 --thread-concurrency 1024,1024");
		AMD2Neo.put("AMD Radeon HD 4850", "-I 17 -g 1 -w 256 --thread-concurrency 3136,3136");
		AMD2Neo.put("AMD Radeon HD 4870", "-I 17 -g 1 -w 128 --thread-concurrency 6400,6400");
		AMD2Neo.put("AMD Radeon HD 4890", "-I 15 -g 1 -w 128 --thread-concurrency 6400,6400");
		AMD2Neo.put("AMD Radeon HD 5450", "-I 18 -w 256 --shaders 80,80");
		AMD2Neo.put("AMD Radeon HD 5670", "-I 16 -g 2 -w 128 --thread-concurrency 3048,3048");
		AMD2Neo.put("AMD Radeon HD 5750", "-I 18 -g 1 -w 256 --thread-concurrency 6016,6016");
		AMD2Neo.put("AMD Radeon HD 5770", "-I 17 --thread-concurrency 7680,7680");
		AMD2Neo.put("AMD Radeon HD 5830", "-I 18 --thread-concurrency 5600,5600");
		AMD2Neo.put("AMD Radeon HD 5850", "-I 19 -g 1 -w 256 --thread-concurrency 5824,5824");
		AMD2Neo.put("AMD Radeon HD 5870", "-I 18 -g 1 -w 256 --thread-concurrency 7500,7500");
		AMD2Neo.put("AMD Radeon HD 5970", "-I 20 -g 1 -w 128 --thread-concurrency 8000,8000");
		AMD2Neo.put("AMD Radeon HD 6320", "-I 9");
		AMD2Neo.put("AMD Radeon HD 6450", "--shaders 160 --intensity 8 --worksize 64 --gpu-memclock 900,900 --gpu-engine 725,725");
		AMD2Neo.put("AMD Radeon HD 6570", "-I 14 -g 1 --shaders 480");
		AMD2Neo.put("AMD Radeon HD 6670", "-I 18 -g 1 -w 256 --thread-concurrency 2400,2400");
		AMD2Neo.put("AMD Radeon HD 6750", "-I 16 -g 1 -w 128 --thread-concurrency 5760,5760");
		AMD2Neo.put("AMD Radeon HD 6770", "-I 18 -g 1 -w 256 --thread-concurrency 8192,8192");
		AMD2Neo.put("AMD Radeon HD 6790", "-I 18 -g 1 -w 256 --thread-concurrency 4032,4032");
		AMD2Neo.put("AMD Radeon HD 6850", "-I 17 -g 2 -w 256 --thread-concurrency 3840,3840");
		AMD2Neo.put("AMD Radeon HD 6870", "-I 12 --gpu-memclock 760,760 --gpu-engine 850,850 --thread-concurrency 8192,8192");
		AMD2Neo.put("AMD Radeon HD 6930", "-I 18 -g 1 -w 256 --thread-concurrency 6400,6400");
		AMD2Neo.put("AMD Radeon HD 6950", "-I 15 -g 1 -w 256 -l 1 --thread-concurrency 6144,6144");
		AMD2Neo.put("AMD Radeon HD 6970", "-I 19 -w 256 --shaders 1536,1536");
		AMD2Neo.put("AMD Radeon HD 7750", "-I 12 --gpu-memclock 760,760 --gpu-engine 850,850 --thread-concurrency 8192,8192");
		AMD2Neo.put("AMD Radeon HD 7770", "-I 15 --worksize 256 -g 1 --thread-concurrency 8000,8000");
		AMD2Neo.put("AMD Radeon HD 7790", "-I 18 -g 1 -w 256 --thread-concurrency 8000,8000");
		AMD2Neo.put("AMD Radeon HD 7850", "-I 17 -g 1 --lookup-gap 2 -w 256 --thread-concurrency 10048,10048 --gpu-engine 1200,1200 --gpu-memclock 1250,1250");
		AMD2Neo.put("AMD Radeon HD 7870", "-I 12 -g 2 -w 256 --thread-concurrency 8192,8192");
		AMD2Neo.put("AMD Radeon HD 7950", "-w 256 -I 19 -s 1 -g 1 --gpu-powertune 3,3 --gpu-engine 1035,1035 --gpu-memclock 1250,1250 --lookup-gap 2,2 --thread-concurrency 24000,24000");
		AMD2Neo.put("AMD Radeon HD 7970", "-I 13 -g 2 -w 256 --thread-concurrency 8192,8192 --gpu-memclock 1250,1250 --gpu-engine 1025,1025");
		AMD2Neo.put("AMD Radeon HD 7990", "-I 13 -g 2 -w 256 --thread-concurrency 8192,8192");
		AMD2Neo.put("AMD Radeon R9 270", "-I 19 -w 256 --thread-concurrency 16000,16000 --gpu-memclock 1500,1500 --gpu-engine 1125,1125");
		AMD2Neo.put("AMD Radeon R9 270x", "-w 256 -I 19 --shaders 1280 --gpu-memclock 1500,1500 --gpu-engine 1125,1125 --thread-concurrency 16000,16000");		
		AMD2Neo.put("AMD Radeon R9 280x", "-g 2 --worksize 256 -I 13 --thread-concurrency 8192,8192 --gpu-engine 1050,1050 --gpu-memclock 1500,1500");
		AMD2Neo.put("AMD Radeon R9 290", " -I 20 -g 2 -w 512 --thread-concurrency 32765,32765 --gpu-memclock 1500,1500 --gpu-engine 990,990");
		AMD2Neo.put("AMD Radeon R9 290x", "-I 20 -w 256 --thread-concurrency 32765,32765");
		
		AMD3Neo.put("AMD Radeon HD 4350", "-I 9 -g 1 -w 128 --thread-concurrency 2048,2048,2048");
		AMD3Neo.put("AMD Radeon HD 4750", "-I 11 -g 1 -w 128 --thread-concurrency 1024,1024,1024");
		AMD3Neo.put("AMD Radeon HD 4850", "-I 17 -g 1 -w 256 --thread-concurrency 3136,3136,3136");
		AMD3Neo.put("AMD Radeon HD 4870", "-I 17 -g 1 -w 128 --thread-concurrency 6400,6400,6400");
		AMD3Neo.put("AMD Radeon HD 4890", "-I 15 -g 1 -w 128 --thread-concurrency 6400,6400,6400");
		AMD3Neo.put("AMD Radeon HD 5450", "-I 18 -w 256 --shaders 80");
		AMD3Neo.put("AMD Radeon HD 5670", "-I 16 -g 2 -w 128 --thread-concurrency 3048,3048,3048");
		AMD3Neo.put("AMD Radeon HD 5750", "-I 18 -g 1 -w 256 --thread-concurrency 6016,6016,6016");
		AMD3Neo.put("AMD Radeon HD 5770", "-I 17 --thread-concurrency 7680,7680,7680");
		AMD3Neo.put("AMD Radeon HD 5830", "-I 18 --thread-concurrency 5600,5600,5600");
		AMD3Neo.put("AMD Radeon HD 5850", "-I 19 -g 1 -w 256 --thread-concurrency 5824,5824,5824");
		AMD3Neo.put("AMD Radeon HD 5870", "-I 18 -g 1 -w 256 --thread-concurrency 7500,7500,7500");
		AMD3Neo.put("AMD Radeon HD 5970", "-I 20 -g 1 -w 128 --thread-concurrency 8000,8000,8000");
		AMD3Neo.put("AMD Radeon HD 6320", "-I 9");
		AMD3Neo.put("AMD Radeon HD 6450", "--shaders 160 --intensity 8 --worksize 64 --gpu-memclock 900,900,900 --gpu-engine 725,725,725");
		AMD3Neo.put("AMD Radeon HD 6570", "-I 14 -g 1 --shaders 480");
		AMD3Neo.put("AMD Radeon HD 6670", "-I 18 -g 1 -w 256 --thread-concurrency 2400,2400,2400");
		AMD3Neo.put("AMD Radeon HD 6750", "-I 16 -g 1 -w 128 --thread-concurrency 5760,5760,5760");
		AMD3Neo.put("AMD Radeon HD 6770", "-I 18 -g 1 -w 256 --thread-concurrency 8192,8192,8192");
		AMD3Neo.put("AMD Radeon HD 6790", "-I 18 -g 1 -w 256 --thread-concurrency 4032,4032,4032");
		AMD3Neo.put("AMD Radeon HD 6850", "-I 17 -g 2 -w 256 --thread-concurrency 3840,3840,3840");
		AMD3Neo.put("AMD Radeon HD 6870", "-I 12 --gpu-memclock 760,760,760 --gpu-engine 850,850,850 --thread-concurrency 8192,8192,8192");
		AMD3Neo.put("AMD Radeon HD 6930", "-I 18 -g 1 -w 256 --thread-concurrency 6400,6400,6400");
		AMD3Neo.put("AMD Radeon HD 6950", "-I 15 -g 1 -w 256 -l 1 --thread-concurrency 6144,6144,6144");
		AMD3Neo.put("AMD Radeon HD 6970", "-I 19 -w 256 --shaders 1536");
		AMD3Neo.put("AMD Radeon HD 7750", "-I 12 --gpu-memclock 760,760,760 --gpu-engine 850,850,850 --thread-concurrency 8192,8192,8192");
		AMD3Neo.put("AMD Radeon HD 7770", "-I 15 --worksize 256 -g 1 --thread-concurrency 8000,8000,8000");
		AMD3Neo.put("AMD Radeon HD 7790", "-I 18 -g 1 -w 256 --thread-concurrency 8000,8000,8000");
		AMD3Neo.put("AMD Radeon HD 7850", "-I 17 -g 1 --lookup-gap 2 -w 256 --thread-concurrency 10048,10048,10048 --gpu-engine 1200,1200,1200 --gpu-memclock 1250,1250,1250");
		AMD3Neo.put("AMD Radeon HD 7870", "-I 12 -g 2 -w 256 --thread-concurrency 8192,8192,8192");
		AMD3Neo.put("AMD Radeon HD 7950", "-w 256 -I 19 -s 1 -g 1 --gpu-powertune 3 --gpu-engine 1035,1035,1035 --gpu-memclock 1250,1250,1250 --lookup-gap 2 --thread-concurrency 24000,24000,24000");
		AMD3Neo.put("AMD Radeon HD 7970", "-I 13 -g 2 -w 256 --thread-concurrency 8192,8192,8192 --gpu-memclock 1250,1250,1250 --gpu-engine 1025,1025,1025");
		AMD3Neo.put("AMD Radeon HD 7990", "-I 13 -g 2 -w 256 --thread-concurrency 8192,8192,8192");
		AMD3Neo.put("AMD Radeon R9 270", "-I 19 -w 256 --thread-concurrency 16000,16000,16000 --gpu-memclock 1500,1500,1500 --gpu-engine 1125,1125,1125");
		AMD3Neo.put("AMD Radeon R9 270x", "-w 256 -I 19 --shaders 1280 --gpu-memclock 1500,1500,1500 --gpu-engine 1125,1125,1125 --thread-concurrency 160000,160000,160000");		
		AMD3Neo.put("AMD Radeon R9 280x", "-g 2 --worksize 256 -I 13 --thread-concurrency 8192,8192,8192 --gpu-engine 1050,1050,1050 --gpu-memclock 1500,1500,1500");
		AMD3Neo.put("AMD Radeon R9 290", " -I 20 -g 2 -w 512 --thread-concurrency 32765,32765,32765 --gpu-memclock 1500,1500,1500 --gpu-engine 990,990,990");
		AMD3Neo.put("AMD Radeon R9 290x", "-I 20 -w 256 --thread-concurrency 32765,32765,32765");
		
		NVIDIANeo.put("NVIDIA GeForce GTX 760","-I 13 -w 128");
		NVIDIANeo.put("NVIDIA GeForce GTX 780 Ti","-I 13 -w 128");
		NVIDIANeo.put("NVIDIA GeForce 8800 GT","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce 9600 GT","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce 9800 GT","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 260","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GT 440","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GT 520","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GT 640","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 260","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 275","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTS 450","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 460","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 470","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 480","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 555","-w 8 -I 8");
		NVIDIANeo.put("NVIDIA GeForce GTX 560","-I 13 --worksize 64 -g 1");
		NVIDIANeo.put("NVIDIA GeForce GTX 550 Ti","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 560 Ti","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 570","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 580","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 590","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GT 640","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 650","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 650 Ti","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 660","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 660 Ti","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 670","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 680","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 770","-I 13 --worksize 64");
		NVIDIANeo.put("NVIDIA GeForce GTX 750 Ti","-I 13 --worksize 128 --gpu-dyninterval 7 -g 1");
		NVIDIANeo.put("NVIDIA GeForce GTX TITAN","-w 128 -I 14");
	}
}
