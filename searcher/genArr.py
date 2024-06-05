from tkinter import Tk
#sorted array generator
l = int(input("How long should the array be?: "))
arr = "{"
t = 0

while t < l:
    arr += str(t) +","
    t += 1

arr += str(l)+"}"
#print(arr)

r = Tk()
r.withdraw()
r.clipboard_clear()
r.clipboard_append(arr)
r.update() # now it stays on the clipboard after the window is closed
r.destroy()
print("Array copied to clipboard")
