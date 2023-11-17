from tkinter import *
import qrcode
root=Tk()
root.geometry("1000x550")
root.resizable(width=False,height=False)
root.title("QR-Code Generator"+" by Fred")
root["bg"]="black"
#Icone

def generer():
    data=mavariable.get()
    name=mavariable1.get()
    qr=qrcode.QRCode(version=1,error_correction=qrcode.constants.ERROR_CORRECT_L,box_size=10,border=4,)
    qr.add_data(data)
    qr.make(fit=True)
    img=qr.make_image(fill_color="red",back_color="black")
    img.save("qrcode/"+str(name)+".png")
    print(img)
    #img.show()
    global Image
    Image=PhotoImage(file="Qrcode/"+str(name)+".png")
    img_label.config(image=Image)
img_label=Label(root,bg="black")
img_label.pack(padx=50,pady=10,side=RIGHT)
mavariable=StringVar()
mavariable1=StringVar()
label=Label(root,text="Title",width=10,bg="white").place(x=50,y=200)
entry1=Entry(root,textvar=mavariable,width=40,bg="white").place(x=50,y=225)
entry2=Entry(root,textvar=mavariable1,width=40,bg="white").place(x=50,y=250)
bouton=Button(root,text="Generer",width=10,height=1,bg="red",fg="black",command=generer).place(x=50,y=275)
root.mainloop()
