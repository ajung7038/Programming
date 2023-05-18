using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            // 정수의 개수
            int n = int.Parse(Console.ReadLine());  

            // 정수 배열
            string [] numbers = Console.ReadLine().Split();

            // 찾으려는 정수
            string v = Console.ReadLine();

            // 찾기
            int result = Array.FindAll(numbers, x => x == v).Length;

            Console.WriteLine(result);
        }
    }
}